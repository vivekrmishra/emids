package emids;

public class ProspectCustomer {
	private String name;
	private String gender;
	private int age;
	private ProspectCustomerHealth health;
	private ProspectCustomerHabits habits;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ProspectCustomerHealth getHealth() {
		return health;
	}

	public void setHealth(ProspectCustomerHealth health) {
		this.health = health;
	}

	public ProspectCustomerHabits getHabits() {
		return habits;
	}

	public void setHabits(ProspectCustomerHabits habits) {
		this.habits = habits;
	}

	public ProspectCustomer(String name, String gender, int age, String hypertension,
			String bloodPressure, String bloodSugar, String overWeight, 
			String smoking, String alcohol, String dailyExercise, String drugs) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.health = new ProspectCustomerHealth(hypertension, bloodPressure, 
				bloodSugar, overWeight);
		this.habits = new ProspectCustomerHabits(smoking, alcohol, dailyExercise, 
				drugs);
	}
	
}
