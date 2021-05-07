package abstracts;

import entites.Customer;
import entites.Game;
import entites.Order;

public abstract class BaseAbstractSaleService {
	
	public abstract void Sell (Customer customer, Order order, Game[] games);

}
