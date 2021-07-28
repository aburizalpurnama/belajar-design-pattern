package facade.pattern.app;

import facade.pattern.entity.Account;
import facade.pattern.facade.or.service.TransactionService;
import facade.pattern.repository.AccountRepository;
import facade.pattern.repository.AccountRepositoryImpl;

public class BankApp {

    public static void main(String[] args) {
        facade();
    }

    static void facade(){
        TransactionService transactionService = new TransactionService();
        transactionService.transfer("a01", "a02", 1_000_000l);
    }

    static void manual(){
        AccountRepository accountRepository = new AccountRepositoryImpl();

        Account account1 = accountRepository.findById("a01");
        Account account2 = accountRepository.findById("a02");

        // account1 Melakuka transfer ke account2
        Long transferAmount = 1_000_000l;
        account1.setBalance(account1.getBalance() - transferAmount);
        account2.setBalance(account2.getBalance() + transferAmount);

        accountRepository.update(account1);
        accountRepository.update(account2);
    }
}
