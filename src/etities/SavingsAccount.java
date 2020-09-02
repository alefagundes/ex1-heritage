package etities;

public class SavingsAccount extends Account {

	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String houlder, Double balanece, Double interestRate) {
		super(number, houlder, balanece);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	public void interest() {
		balanece += balanece * interestRate;
	}
	
}
