package user.get;

import configuration.Config;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

public class GetUserSpecs {
    public  static RequestSpecification getAllPostsForUserRequestSpec(){
        return new RequestSpecBuilder()
                .setBaseUri(Config.getBaseUrl())
                .addQueryParam("userId", "1")
                .build();
    }

    public static ResponseSpecification getAllPostsForUserResponseSpec(){
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectBody("[0].userId", equalTo(1))
                .expectBody("", hasSize(10))
                .build();
    }
}
