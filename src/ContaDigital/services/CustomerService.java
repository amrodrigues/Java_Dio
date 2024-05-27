package ContaDigital.services;


import ContaDigital.model.*;

public class CustomerService {
    private Bank bank;

    public CustomerService(Bank bank) {
        this.bank = bank;
    }

    public void createAccount(Customer customer, String accountNumber, boolean isChecking) {
        Account account;
        if (isChecking) {
            account = new CheckingAccount(accountNumber, customer);
        } else {
            account = new SavingsAccount(accountNumber, customer);
        }
        bank.addAccount(account);
    }
}