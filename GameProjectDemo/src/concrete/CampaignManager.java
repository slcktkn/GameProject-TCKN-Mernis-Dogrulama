package concrete;

import abstracts.ICampaignService;
import entites.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign added :"+campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign updated :"+campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign deleted :"+campaign.getCampaignName());
		
	}

}
