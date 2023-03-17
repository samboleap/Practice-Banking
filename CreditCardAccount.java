package interfacedemo;

public class CreditCardAccount implements Account{
    private double balance;
    private float interestRates;
    private double limitCredit;
    CreditCardAccount(){
        balance =10;
        limitCredit = 100;
        interestRates = 30;
    }
    @Override
    public void deposit(double amount) {
    balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount<=limitCredit){
            if (amount<=balance){
                balance -= amount;
            }
            else
                System.out.println("Insufficient balance");
        }
        else
            System.out.println("Amount exceeds the limit");

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
