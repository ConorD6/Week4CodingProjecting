package Week5;

public class Manager extends Employee {
	
	public Manager(String firstName, String lastName, double pay, double bonusPercentage) {
		super(firstName, lastName, pay);
		this.bonusPercentage = bonusPercentage;
	}

	private double bonusPercentage;

	@Override
	public double calculatePay() {
		return getPay() * 80 * bonusPercentage; 
	}

	
	
	
	
	
}
