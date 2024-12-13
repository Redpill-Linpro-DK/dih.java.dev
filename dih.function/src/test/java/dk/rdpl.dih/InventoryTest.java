package dk.rdpl.dih;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class InventoryTest {
  @Test
  void inventoryGetTest() {
    given()
        .when().get("/inventory/1")
        .then()
        .statusCode(200);
  }

}
