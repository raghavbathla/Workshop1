package SavingAccount;

public class SavingAccount {
    public static double annualInterestRate;
    private double savingBalance;
    private static double modifyInterestRate;

    public SavingAccount(double savingBalance,double annualInterestRate) {
        this.savingBalance = savingBalance;
        this.annualInterestRate=annualInterestRate;
    }

    public double calculateMonthlyInterest() {
        double interest = (this.savingBalance * annualInterestRate) / 12;
        return this.savingBalance + interest;
    }

    public static void modifyInterestRate(double rate) {
        annualInterestRate = rate;
    }

}
