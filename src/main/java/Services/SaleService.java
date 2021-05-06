package Services;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SaleService {
void Sell(Game game, Gamer gamer);
void SellWithCampaign(Game game, Gamer gamer, Campaign campaign);
}
