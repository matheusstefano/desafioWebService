package desafioWebService;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class WebServiceTest {
	
	@Test
	public void TesteApi() {
		Response respo = RestAssured.given()
				.queryParam("director", "George Lucas")
				.queryParam("producer", "Rick McCallum")
				.when()
				.get("https://swapi.co/api/films")
				.then()
				.statusCode(200)
				.log().body()
				.extract().response();
				
	}
}
