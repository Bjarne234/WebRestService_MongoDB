package bj_WebRestService_MongoDB_com;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Builder;
import lombok.Data;

@Document(collection = "Customer")
@Data
@Builder
public class Customer {

    @Id
    private final String id;

    private final String firstName;
    private final String lastName;

}
