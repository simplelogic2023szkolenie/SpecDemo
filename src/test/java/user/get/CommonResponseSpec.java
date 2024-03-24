package user.get;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

import static org.hamcrest.Matchers.*;

public class CommonResponseSpec {
    public static ResponseSpecification getOk(){
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectResponseTime(lessThan(2000L))
                .expectHeader("stały_nazwa_header", "stały_wartosc_header")
                .expectHeader("stały_nazwa_header2", "stały_wartosc_header2")
                .build();
    }
}
