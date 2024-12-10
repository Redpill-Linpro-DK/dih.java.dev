package io.quarkus;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

@QuarkusTest
public class DihFunctionTest {
  // NOTE: RestAssured is aware of the application.properties
  // quarkus.http.root-path switch

  @Test
  public void testFunqy() {
    RestAssured.when().get("/ping").then()
        .statusCode(200)
        .contentType("application/json")
        .body(equalTo("\"pong\""));
  }
}
