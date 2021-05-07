package entites;

import abstracts.IEntity;

public class Campaign implements IEntity {
	
	private int id;
	private int orderId;
	private String campaignName;
	
	public Campaign() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Campaign(int id, int orderId, String campaignName) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.campaignName = campaignName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	
	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

}
