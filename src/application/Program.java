package application;

import java.util.Locale;
import java.util.Scanner;

import etities.Account;
import etities.BusinessAccount;
import etities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Account acc = new Account(247970, "alessandro", 0.0);
		BusinessAccount bacc = new BusinessAccount(1023, "toledinho", 0.0, 1000.0);
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "ale", 50.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "lary", 0.0, 23.0);
		
		// DOWNCASTING
		// se quiser converter da clase que estende para a super, voce precisa passar o casting EX:
		
		
		// USING THE instanceof to get if the class is a intance of another class
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.interest();
			System.out.println("Update:" + acc5.getBalanece());
		}
		
	}

}
