package concrete;

import abstracts.CustomerCheckService;
import abstracts.ICustomerService;
import entites.Customer;

public class CustomerManager implements ICustomerService {
	
	private CustomerCheckService _customerCheckService;
	
	public CustomerManager(CustomerCheckService customerCheckService) {
		
		_customerCheckService = customerCheckService;
	}
	
	

	@Override
	public void add(Customer customer) {
		if(_customerCheckService.checkIfRealPerson(customer)) {
		System.out.println("Customer added :"+customer.getFirstName() + customer.getLastName());
		}else {
			System.out.println("Invalid person :"+customer.getNationalityId());
			return;
		}
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Customer updated :"+customer.getFirstName() + customer.getLastName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Customer deleted :"+customer.getFirstName() + customer.getLastName());
		
	}

}
