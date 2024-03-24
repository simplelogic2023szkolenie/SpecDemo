package user.get;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostUser {

    @Test
    public void postUser() {
        given().
            spec(CommonReqestSpec.getSpec()).
        when()

                .post()
        .then()
                .spec(CommonResponseSpec.getOk())
                .body("id", equalTo(11));

    }
}
