package ContaDigital.services;

import ContaDigital.model.Account;

public class AccountService {
    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }

    public void transfer(Account fromAccount, Account toAccount, double amount) {
        fromAccount.transfer(toAccount, amount);
    }
}