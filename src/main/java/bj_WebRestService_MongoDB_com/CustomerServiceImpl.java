package bj_WebRestService_MongoDB_com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getallCustomers() {

        List<Customer> customers = customerRepository.findAll();
        return customers;
    }

    @Override
    public Customer createCustomer(Customer customer) {

        Customer newCustomer = customerRepository.save(customer);

        return newCustomer;
    }

}
