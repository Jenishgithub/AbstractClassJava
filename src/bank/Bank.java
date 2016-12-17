package bank;
public abstract class Bank {

	abstract void getInterestRate();

	abstract void getMinimumLoanAmount();

	void ageOfLoad() {
		System.out.println("The minimum age of all banks is: 80 years");
	}
}
