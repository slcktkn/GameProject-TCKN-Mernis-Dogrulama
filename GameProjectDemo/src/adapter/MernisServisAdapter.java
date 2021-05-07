package adapter;

import java.rmi.RemoteException;

import abstracts.CustomerCheckService;
import entites.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServisAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();

		boolean result = true;
		try {
			result = soapClient.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),
					customer.getDateOfBirth());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		if (result) {
			
			System.out.println("saved to db: "+customer.getFirstName());
			return true;
}else {
	return false;
}
}
}
