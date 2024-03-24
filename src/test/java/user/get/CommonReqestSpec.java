package user.get;

import configuration.Config;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static org.hamcrest.Matchers.lessThan;

public class CommonReqestSpec {
    public static RequestSpecification getSpec(){
        return new RequestSpecBuilder()
                .setBaseUri(Config.getBaseUrl())
                .addCookie(SessoinProvider.getCookie())
                .build();
    }
}
