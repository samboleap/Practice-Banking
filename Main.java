package interfacedemo;

public class Main {
    public static void main(String[] args) {

        BankingAccountII creditAccount = new BankingAccountII(new CreditCardAccount());
        creditAccount.deposit(4000);
        System.out.println("Your deposit in CreditAccount is :"+creditAccount.showBalance()+"$");
        System.out.println("-----------------------------------------------");
        creditAccount.withdrawMoney(30);
        System.out.println("Your current balance in CreditAccount is :"+creditAccount.showBalance()+"$");

        System.out.println("-----------------------------------------------");
        BankingAccountII savingAccount = new BankingAccountII(new SavingAccount());
        savingAccount.deposit(500);
        System.out.println("Your deposit in SavingAccount is :"+savingAccount.showBalance()+"$");

        System.out.println("-----------------------------------------------");
        BankingAccountII visaAccount = new BankingAccountII(new VisaAccount());
        visaAccount.deposit(300);
        System.out.println("Your deposit in VisaAccount is :"+visaAccount.showBalance()+"$");
        System.out.println("-----------------------------------------------");
        visaAccount.withdrawMoney(1000);
        System.out.println("Your withdraw in VisaAccount is :"+visaAccount.showBalance()+"$");


    }
}
