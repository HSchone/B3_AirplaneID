
public class AirplaneID {
	int spotEng = 3;
	String spotLoc = "body";
	String spotType = "jet";
	int idEng;
	String idLoc;
	String idType;
	public  void createAirplaneData() {
		// do this in AirplaneID class
		AirplaneData F15 = new AirplaneData();
			F15.setNumberEngines(2);
			F15.setEngineType("jet");
			F15.setEngineLocation("body");
		
		AirplaneData F16 = new AirplaneData();
			F16.setNumberEngines(1);
			F16.setEngineType("jet");
			F16.setEngineLocation("body");
		
		AirplaneData F18 = new AirplaneData();
			F18.setNumberEngines(2);
			F18.setEngineType("jet");
			F18.setEngineLocation("body");
		
		AirplaneData F22 = new AirplaneData();
			F22.setNumberEngines(2);
			F22.setEngineType("jet");
			F22.setEngineLocation("body");
		
		AirplaneData F35 = new AirplaneData();
			F35.setNumberEngines(1);
			F35.setEngineType("jet");
			F35.setEngineLocation("body");
		
		AirplaneData A10 = new AirplaneData();
			A10.setNumberEngines(2);
			A10.setEngineType("jet");
			A10.setEngineLocation("rear");

		
	}
	
	
	private void engineNumb() {
		if (spotEng == 1) {
			
		} else if (spotEng == 2) {
			
		} else if (spotEng == 3) {
			
		} else if (spotEng == 4) {
			
		} else {
			
		}
		
	}
	
	private void engineLoc() {
		if (spotLoc.equals("body")) {
			
		} else if (spotLoc.equals("wings")) {
			
		} else if (spotLoc.equals("rear")) {
						
		} else {
			
		}
		
	}
	
	private void engineType() {
		if (spotType.equals("jet")) {
			
		} else if (spotType.equals("propeller")) {
			
		} else {
			
		}
		
	}
	
	public void determiner() {
		
	}
	
}




