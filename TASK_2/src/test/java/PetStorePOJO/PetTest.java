package PetStorePOJO;

import Utilities.ConfigurationRW;
import io.restassured.http.ContentType;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import java.io.IOException;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PetTest {
    Pet pet = new Pet();


    @BeforeClass
    public static void setup() {
        baseURI=ConfigurationRW.get("BASE_URL");

    }

    @Test(priority = 1)
      public void PostWithPOJO() throws IOException {
        String endpoint = ConfigurationRW.get("POST_ENDPOINT");
        long id=Long.parseLong( ConfigurationRW.get("id"));

        pet.setId(id);
        pet.setName("chico");
        pet.setStatus("available");

      given().log().all()
               .accept(ContentType.JSON)
               .and().contentType(ContentType.JSON)
               .and().body(pet)
      .when().post(endpoint)
      .then().log().all()
              .statusCode(200)
              .contentType("application/json")
              .body("name", is("chico"), "status", is("available"));;


    }
    @Test(priority = 2)
    public void GetWithPOJO() throws IOException {
        String endpoint = ConfigurationRW.get("GET_ENDPOINT");
        long id=Long.parseLong( ConfigurationRW.get("id"));

        given().log().all()
                .accept(ContentType.JSON)
                .and().contentType(ContentType.JSON)
                .pathParam("id",id)
                .when().get(endpoint+"{id}")
                .then().log().all()
                .statusCode(200)
                .contentType("application/json")
                .body("name", is("chico"), "status", is("available"));

    }


    @Test(priority = 3)
       public void PutWithPOJO() {
        String endpoint = ConfigurationRW.get("PUT_ENDPOINT");
        long id=Long.parseLong( ConfigurationRW.get("id"));
        pet.setId(id);
        pet.setName("ela");
        pet.setStatus("sold");

        given().log().all()
                .accept(ContentType.JSON)
                .and().contentType(ContentType.JSON)
                .and().body(pet)
                .when().put(endpoint)
                .then().log().all()
                .statusCode(200)
                .contentType("application/json")
                .body("name", is("ela"), "status", is("sold"));
    }

    @Test(priority = 4)
        public void DeleteWithPOJO() {
        String endpoint = ConfigurationRW.get("DELETE_ENDPOINT");
        long id=Long.parseLong( ConfigurationRW.get("id"));
        given().log().all()
                .accept(ContentType.JSON)
                .and().contentType(ContentType.JSON)
                .pathParam("id",id)
        .when().delete(endpoint+"{id}")
        .then().log().all()
                .statusCode(200)
                .contentType("application/json");
    }


}