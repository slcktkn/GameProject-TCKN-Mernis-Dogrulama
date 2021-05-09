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
	double discountRatio = 0.96;
	double totalPrice;
	
	for(Game game:games) {
		if(customer.isStudent()) {
			price = game.getGamePrice()*discountRatio;	
			System.out.println("game ordered for: "+customer.getFirstName()
			+" game name: "+game.getGameName()
			+" discount price is: "+price+"TL");
			System.out.println("Price= "+ price);
	}else {
		price = game.getGamePrice();
		System.out.println("game ordered for: "+customer.getFirstName()
		+" game name: "+game.getGameName()
		+" price is: "+price+"TL");
		
	}
	}		
}
	}
	
