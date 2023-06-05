package bj_WebRestService_MongoDB_com.example.WebRestService_MongoDB;

import bj_WebRestService_MongoDB_com.Customer;
import bj_WebRestService_MongoDB_com.CustomerRepository;
import bj_WebRestService_MongoDB_com.CustomerServiceImpl;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.mockito.Mockito.when;

public class CustomerServiceImplTest {

    @Mock
    private CustomerRepository customerRepository;

    @Test
    public void should_get_all_cutomers(){

        // given
        CustomerServiceImpl cutomerService = new CustomerServiceImpl(customerRepository);
        when(customerRepository.findAll() ).thenReturn(List.of(Customer.builder().firstName("Hans").build(), Customer.builder().firstName("Timm").build()));

        // when
        List<Customer> allCutomer = cutomerService.getallCustomers();

        // then
        MatcherAssert.assertThat(allCutomer, Matchers.hasSize(2));


    }

    @BeforeMethod
    public void setup () {
        MockitoAnnotations.openMocks(this);
    }



    //ToDo createCutomer test Überprüfen ob customer createt wurde

    //given

    //when

    //then



}
