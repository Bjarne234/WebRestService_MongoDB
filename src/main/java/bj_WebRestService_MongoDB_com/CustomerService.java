package bj_WebRestService_MongoDB_com;

import java.util.List;

public interface CustomerService {

    List<Customer> getallCustomers();

    Customer createCustomer(Customer customer);

}
