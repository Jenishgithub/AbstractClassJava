package bank;
public class UserClass {

	public static void main(String[] args) {
		Bank nepalInvest = new NepalInvestment();
		nepalInvest.getMinimumLoanAmount();
		nepalInvest.getInterestRate();

		Bank sbiBank = new SBIBank();
		sbiBank.getMinimumLoanAmount();
		sbiBank.getInterestRate();

		sbiBank.ageOfLoad();// this is common for both classes
	}
}
