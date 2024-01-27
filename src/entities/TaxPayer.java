package entities;

public abstract class TaxPayer {
	
	private String name;
	private Double anulaIncome;
	
	
	
	public TaxPayer() {
		super();
	}


	public TaxPayer(String name, Double anulaIncome) {
		super();
		this.name = name;
		this.anulaIncome = anulaIncome;
	}


	public String getName() {
		return name;
	}


	public Double getAnulaIncome() {
		return anulaIncome;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAnulaIncome(Double anulaIncome) {
		this.anulaIncome = anulaIncome;
	}
	
	public abstract  double tax();
	
}
