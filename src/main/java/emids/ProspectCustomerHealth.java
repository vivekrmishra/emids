package emids;

public class ProspectCustomerHealth {
	private String hypertension;
	private String bloodPressure;
	private String bloodSugar;
	private String overWeight;
	
	ProspectCustomerHealth(String hypertension, String bloodPressure, 
			String bloodSugar, String overWeight) {
		this.hypertension = hypertension;
		this.bloodPressure = bloodPressure;
		this.bloodSugar = bloodSugar;
		this.overWeight = overWeight;
	}
	
	public String getHypertension() {
		return hypertension;
	}
	public void setHypertension(String hypertension) {
		this.hypertension = hypertension;
	}
	public String getBloodPressure() {
		return bloodPressure;
	}
	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	public String getBloodSugar() {
		return bloodSugar;
	}
	public void setBloodSugar(String bloodSugar) {
		this.bloodSugar = bloodSugar;
	}
	public String getOverWeight() {
		return overWeight;
	}
	public void setOverWeight(String overWeight) {
		this.overWeight = overWeight;
	}
}
