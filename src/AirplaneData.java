
public class AirplaneData {
	
	// field variables - private NO DIRECT ACCESS!
	private int numberEngines = 0;
	private int numberVerticalTailWings = 0;
	private String engineType;
	private String engineLocation;
	
	
	public String getEngineType() {
		return engineType;
	}


	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}


	public String getEngineLocation() {
		return engineLocation;
	}


	public void setEngineLocation(String engineLocation) {
		this.engineLocation = engineLocation;
	}


	public AirplaneData() {
		
	}


	public int getNumberEngines() {
		return numberEngines;
	}


	public void setNumberEngines(int numberEngines) {
		this.numberEngines = numberEngines;
	}


	public int getNumberVerticalTailWings() {
		return numberVerticalTailWings;
	}


	public void setNumberVerticalTailWings(int numberVerticalTailWings) {
		this.numberVerticalTailWings = numberVerticalTailWings;
	}




	
}
