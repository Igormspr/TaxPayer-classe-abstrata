package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployee;
	
	
	
	public Company() {
		super();
	}
	
	
	public Company(String name, Double anulaIncome, Integer numberOfEmployee) {
		super(name, anulaIncome);
		this.numberOfEmployee = numberOfEmployee;
	}



	public Integer getNumberOfEmployee() {
		return numberOfEmployee;
	}


	public void setNumberOfEmployee(Integer numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}


	@Override
	public double tax() {
		double sum = 0;
		if (numberOfEmployee > 10) {
		sum += getAnulaIncome()*0.14;
		}
		else {
		sum += getAnulaIncome()*0.16;
			
		}
		
		return sum;
	}
	
	

}
