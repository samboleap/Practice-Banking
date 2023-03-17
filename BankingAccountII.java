package interfacedemo;

public class BankingAccountII {
    private Account account;

  public BankingAccountII(Account account){
      this.account = account;
  }
  public double showBalance(){
      return account.checkbalance();
  }
  public void withdrawMoney(double amount){
    account.withdraw(amount);
  }

    public void deposit(double amount) {
        account.deposit(amount);
    }
}
