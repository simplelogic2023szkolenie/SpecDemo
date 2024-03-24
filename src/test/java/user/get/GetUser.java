package user.get;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetUser {
    private static String posts = "/posts";

    @Test
    public void shouldGetPostsForUser() {
        given().
                    spec(GetUserSpecs.getAllPostsForUserRequestSpec()).
                when().
                    get(posts).
                then().
                    spec(GetUserSpecs.getAllPostsForUserResponseSpec());
    }
}
