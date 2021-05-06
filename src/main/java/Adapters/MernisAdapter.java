package Adapters;

import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter {
	  public boolean customerCheck(Gamer gamer) {
	        boolean result;
	  
	        KPSPublicSoapProxy publicSooap = new KPSPublicSoapProxy();
	        
	        try { 
	        	result = publicSooap.TCKimlikNoDogrula(
	        			 Long.parseLong(gamer.getNationalityId()),
	                     gamer.getFirstName().toUpperCase(),
	                     gamer.getLastName().toUpperCase(),
	                     gamer.getBirthOfYear()
	        			
	        			
	            };
	  }
}
