package facade.pattern.repository;

import facade.pattern.entity.Customer;

public class CustomerRepositoryImpl implements CustomerRepository{
    @Override
    public void save(Customer customer) {
        // do some sql code
    }
}
