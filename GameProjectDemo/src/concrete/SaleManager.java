package concrete;

import abstracts.IOrderService;
import abstracts.ISaleService;
import entites.Customer;
import entites.Game;
import entites.Order;

public class SaleManager implements ISaleService {
	


@Override
public void sell(Customer customer, Order order, Game[] games) {
	
	
	double price = 0;
	
	for(Game game:games) {
		if(customer.isStudent()) {
		price +=game.getGamePrice()*0.96;	
			System.out.println("game ordered for: "+customer.getFirstName()+"game name: "+game.getGameName()+" discount price is: "+price);
		
	}else {
		price = game.getGamePrice();
		System.out.println("game ordered for: "+customer.getFirstName());
		
	}
	}		
}
	}
	
