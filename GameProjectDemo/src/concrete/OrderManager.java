package concrete;

import abstracts.IOrderService;
import entites.Order;

public class OrderManager implements IOrderService {

	@Override
	public void add(Order order) {
		System.out.println("Order Id: "+order.getOrderId()+" --  "+"Order shipmentcity: "+order.getShipmentCity());
		
	}

}
