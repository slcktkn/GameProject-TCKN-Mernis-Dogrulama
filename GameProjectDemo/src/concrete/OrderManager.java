package concrete;

import abstracts.IOrderService;
import entites.Order;

public class OrderManager implements IOrderService {

	@Override
	public void add(Order order) {
		System.out.println("Order added: "+order.getOrderId());
		
	}

}
