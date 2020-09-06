package model;

public class WristwatchLogic {

	public boolean isPremier(Wristwatch wristwatch) {
		boolean isPremier = false;
		
		if(wristwatch.getMsrp() > 3000.00) {
			isPremier = true;
		}else {
			isPremier = false;
		}
		
		return isPremier;
	}
	
	public String printOriginDescription(Wristwatch wristwatch) {
		String message;
		
		message = "This is a(n) " + wristwatch.getCountry() + " wristwatch.";
		return message;
	}
	
}
