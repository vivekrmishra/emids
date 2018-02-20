package emids;

public class ProspectCustomerHabits {
	private String smoking;
	private String alcohol;
	private String dailyExercise;
	private String drugs;
	
	public ProspectCustomerHabits(String smoking, String alcohol, 
			String dailyExercise, String drugs) {
		this.smoking = smoking;
		this.alcohol = alcohol;
		this.dailyExercise = dailyExercise;
		this.drugs = drugs;
	}
	public String getSmoking() {
		return smoking;
	}
	public void setSmoking(String smoking) {
		this.smoking = smoking;
	}
	public String getAlcohol() {
		return alcohol;
	}
	public void setAlcohol(String alcohol) {
		this.alcohol = alcohol;
	}
	public String getDailyExercise() {
		return dailyExercise;
	}
	public void setDailyExercise(String dailyExercise) {
		this.dailyExercise = dailyExercise;
	}
	public String getDrugs() {
		return drugs;
	}
	public void setDrugs(String drugs) {
		this.drugs = drugs;
	}
	
}
