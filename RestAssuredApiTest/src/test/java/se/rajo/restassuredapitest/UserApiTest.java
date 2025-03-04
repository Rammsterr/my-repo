package se.rajo.restassuredapitest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class UserApiTest {

    static String baseURI = "https://jsonplaceholder.typicode.com";

    @BeforeAll
    public static void setup() {
        baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    public void testGetAllUsers() {
        given()
                .pathParam("id", 1)
                .when()
                .get("https://jsonplaceholder.typicode.com/users/{id}")
                .then()
                .statusCode(200);

    }
}
