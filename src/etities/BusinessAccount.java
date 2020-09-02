package etities;

public class BusinessAccount extends Account {
	
	private Double loanLimit = 1000.00;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String houlder, Double balanece, Double loanLimit) {
		super(number, houlder, balanece);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount<=loanLimit) {
			balanece += amount - 10.0;
		}
	}

	
	
}
