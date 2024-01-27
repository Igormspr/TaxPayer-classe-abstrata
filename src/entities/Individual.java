package entities;



public class Individual extends TaxPayer {
	
	
	
	private Double healthExpenditures;
	
	
	public Individual() {
		super();
		
	}
	

	public Individual(String name, Double anulaIncome, Double healthExpenditures) {
		super(name, anulaIncome);
		this.healthExpenditures = healthExpenditures;
	}


	public Double getHealthExpenditures() {
		return healthExpenditures;
	}


	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}


	@Override
	public double tax() {
		double sum = 0;
		if (getAnulaIncome() < 20000) {
		sum += getAnulaIncome()*0.15 - healthExpenditures * 0.5;
	}
		else if (getAnulaIncome() >= 20000) {
		sum += getAnulaIncome() * 0.25 - healthExpenditures * 0.5;
		}
		
			
		
		return sum;
	}

}
