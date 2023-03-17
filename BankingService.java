package interfacedemo;

public class BankingService {
    SavingAccount savingAccount ;
//    CreditCardAccount creditCardAccount;
    BankingService (){

    }


    double showbalance(){
        return savingAccount.checkbalance();
    }
    void addMoney(double amount){
        savingAccount.deposit(amount);
    }
    void withdrawMoney(double amount){
        savingAccount.withdraw(amount);
    }
}
