package facade.pattern.repository;

import facade.pattern.entity.Account;

public interface AccountRepository {
    public Account findById(String id);
    public void update (Account account);
}
