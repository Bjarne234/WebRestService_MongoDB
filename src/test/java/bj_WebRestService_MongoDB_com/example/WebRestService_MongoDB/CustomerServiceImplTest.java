package bj_WebRestService_MongoDB_com.example.WebRestService_MongoDB;

import bj_WebRestService_MongoDB_com.*;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import java.util.List;

import static org.mockito.Mockito.when;

public class CustomerServiceImplTest {
    @Mock
    private CustomerRepository customerRepository;
    private CustomerServiceImpl customerService;

    @Test
    public void should_get_all_cutomers() {

        // given
        CustomerServiceImpl cutomerService = new CustomerServiceImpl(customerRepository);
        when(customerRepository.findAll()).thenReturn(List.of(Customer.builder().firstName("Hans").build(), Customer.builder().firstName("Timm").build()));

        // when
        List<Customer> allCutomer = cutomerService.getallCustomers();


        // then
        MatcherAssert.assertThat(allCutomer, Matchers.hasSize(2));


    }

    @BeforeMethod
    public void setup() {

        MockitoAnnotations.openMocks(this);
        customerService = new CustomerServiceImpl(customerRepository);
    }
    @Test
    public void should_create_customer() {
        //given
        CustomerServiceImpl customerService = new CustomerServiceImpl(customerRepository);
        Customer customer = Customer.builder().firstName("Hans").build();
        when(customerRepository.save(customer)).thenReturn(customer);

        //when
        Customer createdCustomer = customerService.createCustomer(customer);

        //then
        assertEquals(customer, createdCustomer);
        verify(customerRepository, times(1)).save(customer);

    }
}
