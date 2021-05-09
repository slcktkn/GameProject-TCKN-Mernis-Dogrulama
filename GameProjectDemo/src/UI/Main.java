package UI;

import adapter.MernisServisAdapter;
import concrete.CampaignManager;
import concrete.CustomerManager;
import concrete.GameManager;
import concrete.OrderManager;
import concrete.SaleManager;
import entites.Campaign;
import entites.Customer;
import entites.Game;
import entites.Order;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager(new MernisServisAdapter());
		CampaignManager campaignManager = new CampaignManager();
		GameManager gameManager = new GameManager();
		OrderManager orderManager = new OrderManager();
		
		
		Customer selcuk = new Customer(1,"Selçuk","Tekin","12345678901",1987,false,true);
		customerManager.add(selcuk);
		
		Campaign campaign = new Campaign(1,2,"MothersDay");	
		campaignManager.add(campaign);
					
		Game game1 =new Game(1,"CounterStrike",1000);
		gameManager.add(game1);
		Game game2 =new Game(2,"PES2021",2000);
		gameManager.add(game2);
		
		Game[] games= new Game[] {game1,game2};
		
		Order order = new Order(1,1,1,1,"Gaziantep");
		
		SaleManager saleManager = new SaleManager();
		saleManager.sell(selcuk,order,games);
		
		
		orderManager.add(order);

	}

}
