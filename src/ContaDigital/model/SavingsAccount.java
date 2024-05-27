package ContaDigital.model;

public class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber, Customer customer) {
        super(accountNumber, customer);
    }

    @Override
    public void transfer(Account toAccount, double amount) {
        if (getBalance() >= amount) {
            this.withdraw(amount);
            toAccount.deposit(amount);
        }
    }
}