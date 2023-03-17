package interfacedemo;

public class SavingAccount implements Account{
    private double balance;
    private float interestRates;
    SavingAccount(){
        balance = 0;
        interestRates = 90;
    }

    @Override
    public void deposit(double amount) {
        balance +=amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount<=balance){
            balance -= amount;
        }
        else {
            System.out.println("Insufficient balance!!");
        }
    }

    @Override
    public double checkbalance() {
        return balance;
    }

    @Override
    public double calculateInterest() {
        return (balance *(interestRates/100));
    }
}
