package ContaDigital;

import ContaDigital.model.Account;
import ContaDigital.model.Bank;
import ContaDigital.model.Customer;
import ContaDigital.services.AccountService;
import ContaDigital.services.CustomerService;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        CustomerService customerService = new CustomerService(bank);
        AccountService accountService = new AccountService();

        Customer customer1 = new Customer("Alice", "123");
        customerService.createAccount(customer1, "ACC123", true);

        Customer customer2 = new Customer("Bob", "456");
        customerService.createAccount(customer2, "ACC456", false);

        Account account1 = bank.getAccount("ACC123");
        Account account2 = bank.getAccount("ACC456");

        accountService.deposit(account1, 1000);
        accountService.transfer(account1, account2, 500);

        System.out.println("Alice's Balance: " + account1.getBalance());
        System.out.println("Bob's Balance: " + account2.getBalance());
    }
}