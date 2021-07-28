package facade.pattern.repository;

import facade.pattern.entity.Customer;

public interface CustomerRepository {
    public void save(Customer customer);
}
