package facade.pattern.facade.or.service;

import facade.pattern.entity.Customer;
import facade.pattern.repository.AddressRepository;
import facade.pattern.repository.AddressRepositoryImpl;
import facade.pattern.repository.CustomerRepository;
import facade.pattern.repository.CustomerRepositoryImpl;

public class CustomerService {

    public void save(Customer customer){
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        AddressRepository addressRepository = new AddressRepositoryImpl();

        customerRepository.save(customer);
        for (var address : customer.getAddresses()){
            addressRepository.save(address);
        }
    }
}
