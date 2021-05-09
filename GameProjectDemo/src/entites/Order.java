package entites;

import abstracts.IEntity;

public class Order implements IEntity {
	
	private int orderId;
	private int customerId;
	private int campaignId;
	private int gameId;
	private String shipmentCity;
	
	public Order() {
		super();

	}

	public Order(int orderId, int customerId, int campaignId, int gameId, String shipmentCity) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.campaignId = campaignId;
		this.gameId = gameId;
		this.shipmentCity = shipmentCity;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getShipmentCity() {
		return shipmentCity;
	}

	public void setShipmentCity(String shipmentCity) {
		this.shipmentCity = shipmentCity;
	}

}
