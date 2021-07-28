package facade.pattern.repository;

import facade.pattern.entity.Account;

public class AccountRepositoryImpl implements AccountRepository{
    @Override
    public Account findById(String id) {
        // do some sql code
        System.out.println("get Account with id = " + id);
        return new Account("a01", 5_000_000l);
    }

    @Override
    public void update(Account account) {
        // do some sql code
        System.out.println("Updating Account : " + account);
    }
}
