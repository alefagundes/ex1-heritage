package etities;

public class Account {
	private Integer number;
	private String houlder;
	protected Double balanece;
	
	public Account() {
	}

	public Account(Integer number, String houlder, Double balanece) {
		this.number = number;
		this.houlder = houlder;
		this.balanece = balanece;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHoulder() {
		return houlder;
	}

	public void setHoulder(String houlder) {
		this.houlder = houlder;
	}

	public Double getBalanece() {
		return balanece;
	}

	
	public void deposit(double amount) {
		balanece += amount;
	}
	public void withdraw(double amount) {
		balanece -= amount;
	}
	
	

}
