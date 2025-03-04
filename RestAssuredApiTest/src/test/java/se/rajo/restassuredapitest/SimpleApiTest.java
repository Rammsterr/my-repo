package se.rajo.restassuredapitest;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;

public class SimpleApiTest {

    @Test
    public void testGetPost() {
        given()
                .when()
                .get("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .statusCode(200)
                .body("title", notNullValue())
                .body("userId", equalTo(1));
    }
}