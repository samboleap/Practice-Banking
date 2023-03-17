package interfacedemo;

public class VisaAccount implements Account{
    private double balance;
    private double interestRates;
    private double limitDeposit  ;
    VisaAccount(){
        limitDeposit = 1000;

    }
    @Override
    public void deposit(double amount) {

        if (limitDeposit<=amount){
            balance +=amount;
            if (amount>balance){
                System.out.println("The amount your deposit is out of standard");
            }
            else
                System.out.println("Successfully deposit");
        }
        else
            System.out.println("Account is exceed limit");
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
