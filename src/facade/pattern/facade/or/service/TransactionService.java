package facade.pattern.facade.or.service;

import facade.pattern.entity.Account;
import facade.pattern.entity.Transfer;
import facade.pattern.repository.AccountRepository;
import facade.pattern.repository.AccountRepositoryImpl;
import facade.pattern.repository.TransferRepository;
import facade.pattern.repository.TransferRepositoryImpl;

public class TransactionService {

    public void transfer(String fromAccount, String toAccount, Long amount){
        AccountRepository accountRepository = new AccountRepositoryImpl();
        TransferRepository transferRepository = new TransferRepositoryImpl();

        Account account1 = accountRepository.findById(fromAccount);
        Account account2 = accountRepository.findById(toAccount);

        // account1 Melakuka transfer ke account2
        account1.setBalance(account1.getBalance() - amount);
        account2.setBalance(account2.getBalance() + amount);

        accountRepository.update(account1);
        accountRepository.update(account2);

        Transfer transfer = new Transfer("t01", fromAccount, toAccount, amount);
        transferRepository.insert(transfer);
    }
}
