package facade.pattern.app;

import facade.pattern.entity.Address;
import facade.pattern.entity.Customer;
import facade.pattern.facade.or.service.CustomerService;
import facade.pattern.facade.or.service.GeneralService;
import facade.pattern.repository.AddressRepository;
import facade.pattern.repository.AddressRepositoryImpl;
import facade.pattern.repository.CustomerRepository;
import facade.pattern.repository.CustomerRepositoryImpl;

public class FacadeApp {
    public static void main(String[] args) {
        facade();
    }

    static void manual(){
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        AddressRepository addressRepository = new AddressRepositoryImpl();

        Customer customer = new Customer("01", "Aslan");

        Address address1 = new Address("a01", "Jl. Panjaitan", "Indonesia");
        Address address2 = new Address("a02", "Jl. Charles st", "England");
        customer.getAddresses().add(address1);
        customer.getAddresses().add(address2);

        customerRepository.save(customer);
        addressRepository.save(address1);
        addressRepository.save(address2);
    }

    static void facade(){
        Customer customer = new Customer("01", "Aslan");

        Address address1 = new Address("a01", "Jl. Panjaitan", "Indonesia");
        Address address2 = new Address("a02", "Jl. Charles st", "England");
        customer.getAddresses().add(address1);
        customer.getAddresses().add(address2);

        CustomerService customerService = new CustomerService();
        customerService.save(customer);

        //========================
        // Creating Json
        GeneralService generalService = new GeneralService();
        String json = generalService.toJson(customer);
        System.out.println(json);
    }
}
