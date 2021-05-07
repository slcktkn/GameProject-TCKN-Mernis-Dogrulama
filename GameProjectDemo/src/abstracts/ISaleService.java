package abstracts;

import entites.Customer;
import entites.Game;
import entites.Order;

public interface ISaleService {
	
	public void sell (Customer customer, Order order, Game[] games);
	

}
