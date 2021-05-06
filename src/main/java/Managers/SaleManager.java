package Managers;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Services.SaleService;

public class SaleManager implements SaleService {
public void Sell(Game game,Gamer gamer) {
	if (game.getPrice() > gamer.getMoney()) {
		System.out.println(game.getName() + " oyununu alabilmek için bakiyeniz yetersiz.");
	return;
	}
	System.out.println("Sayýn" + gamer.getFirstName() + "," + game.getName() + "oyunu kiraladýnýz.");
	
	double currentMoney = gamer.getMoney() - game.getPrice();
	gamer.setMoney(currentMoney);
	System.out.println("Kalan bakiyeniz: " + gamer.getMoney());
}

public void SellWithCampaing(Game game,Gamer gamer,Campaign campaign) {
	double newPrice = game.getPrice() - ((campaign.getDiscount() / 100) * game.getPrice());
	game.setPrice(newPrice);
	
	if(game.getPrice() > gamer.getMoney()) {
		System.out.println(game.getName() + " oyunu alabilmek için bakiyeniz yetersiz.");
		return;
	}
	
	System.out.println("Sayýn " + gamer.getFirstName() + "," + game.getName() + "oyunu kiraladýnýz.");
	
	double currentMoney = gamer.getMoney() - game.getPrice();
	gamer.setMoney(currentMoney);
	System.out.println("Kalan bakiyeniz: " + gamer.getMoney());
}

@Override
public void SellWithCampaign(Game game, Gamer gamer, Campaign campaign) {
	// TODO Auto-generated method stub
	
}
}
