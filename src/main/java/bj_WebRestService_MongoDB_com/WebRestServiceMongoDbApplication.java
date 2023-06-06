package bj_WebRestService_MongoDB_com;

import org.apache.logging.log4j.util.Strings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class WebRestServiceMongoDbApplication {


	public static void main(String[] args) {
		//SpringApplication.run(WebRestServiceMongoDbApplication.class, args);


		//Java Streams
		List<Customer> allCutomer = new ArrayList<>();

		Customer customer1 = new Customer("1","Tim", "Kleindienst");
		Customer customer2 = new Customer("2","Fabian", "Reese");
		Customer customer3 = new Customer("3","Tom", "Schippmann");
		Customer customer4 = new Customer("4","Dennis", "Aogo");

		allCutomer.add(customer1);
		allCutomer.add(customer2);
		allCutomer.add(customer3);
		allCutomer.add(customer4);



		System.out.println(("unbearbeitet"));
		allCutomer.forEach(System.out::println);



		System.out.println(("Sortierung"));
		//baue ein Stream der alle FirstNamen sortiert
		allCutomer.stream()
				.sorted(Comparator.comparing(Customer::getFirstName))
				.forEach(System.out::println);







	}

}
