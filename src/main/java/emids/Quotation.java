package emids;

public class Quotation {
	
	public static int calculateQuote (ProspectCustomer customer) {
		
		final String yes = "yes";
		final String male = "male";
		
		double basePremium = 5000;
		int age = customer.getAge();
		int fortyDiffAge = 0;
		int calculationCycles = 0;
		
		double incrementPremium = 0;
		
		String hypertension = customer.getHealth().getHypertension();
		String bloodPressure = customer.getHealth().getBloodPressure();
		String bloodSugar = customer.getHealth().getBloodSugar();
		String overweight = customer.getHealth().getOverWeight();
		
		String dailyExercise = customer.getHabits().getDailyExercise();
		String smoking = customer.getHabits().getSmoking();
		String alcohol = customer.getHabits().getAlcohol();
		String drugs = customer.getHabits().getDrugs();
		
		String gender = customer.getGender();
		
		if (age>=18) {
			basePremium = basePremium * 1.1;
		}
		if (age >= 25) {
			basePremium = basePremium * 1.1;
		}
		if (age >= 30) {
			basePremium = basePremium * 1.1;
		}
		if (age >= 35) {
			basePremium = basePremium * 1.1;
		}
		if (age >= 40) {
			fortyDiffAge = age - 40;
			calculationCycles = fortyDiffAge / 5;
			
			//e.g age=44, loop is one time, e.g. age=47 loop is 2 time, e.g. age=50 loop is 2 times,  
			for (int i=0; i< calculationCycles; i++) {
				basePremium = basePremium * 1.2;
			}
			
			//e.g. age is 54, above loop calculate 2 times for 40-45 and 45-50, the below logic calculate for 50-54
			//e.g. age is 55, above loop reuns 3 time for 40-45, 45-50 and 50-55. Below logic will not execute in this case
			if (fortyDiffAge % 5 > 0) {
				basePremium = basePremium * 1.2;
			}
		}
		
		if (male.equalsIgnoreCase(gender)) {
			basePremium = basePremium * 1.02;
		}
		
		if (yes.equalsIgnoreCase(hypertension)) {
			//basePremium = basePremium * 1.01;
			incrementPremium = incrementPremium + basePremium * 0.01;
		}
		if (yes.equalsIgnoreCase(bloodPressure)) {
			//basePremium = basePremium * 1.01;
			incrementPremium = incrementPremium + basePremium * 0.01;
		}
		if (yes.equalsIgnoreCase(bloodSugar)) {
			//basePremium = basePremium * 1.01;
			incrementPremium = incrementPremium + basePremium * 0.01;
		}
		if (yes.equalsIgnoreCase(overweight)) {
			//basePremium = basePremium * 1.01;
			incrementPremium = incrementPremium + basePremium * 0.01;
		}
		basePremium = basePremium + incrementPremium;
		incrementPremium = 0;
		
		if (yes.equalsIgnoreCase(dailyExercise)) {
			incrementPremium = incrementPremium - basePremium * 0.03;
		}
		if (yes.equalsIgnoreCase(smoking)) {
			incrementPremium = incrementPremium + basePremium * 0.03;
		}
		if (yes.equalsIgnoreCase(alcohol)) {
			incrementPremium = incrementPremium + basePremium * 0.03;
		}
		if (yes.equalsIgnoreCase(drugs)) {
			incrementPremium = incrementPremium + basePremium * 0.03;
		}
		basePremium = basePremium + incrementPremium;
		return (int)Math.ceil(basePremium);
	}
}
