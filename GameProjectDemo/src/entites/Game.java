package entites;

import abstracts.IEntity;

public class Game implements IEntity {
	
	private int gameId;
	private String gameName;
	private double gamePrice;
	
	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Game(int gameId, String gameName, double gamePrice) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}

}
