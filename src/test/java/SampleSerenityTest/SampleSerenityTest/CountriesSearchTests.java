package SampleSerenityTest.SampleSerenityTest;

import org.apache.log4j.BasicConfigurator;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(SerenityRunner.class)
public class CountriesSearchTests {

	
	@BeforeClass
	public static void init() {
		BasicConfigurator.configure();
	    RestAssured.baseURI = "https://reqres.in/api";
		
	}
	
	@Test
	   public void verifyThatWeCanFindUnitedStatesOfAmericaCountryUsingTheCodeUS(){
	       
	     
			RequestSpecification httpRequest = RestAssured.given();
			Response response = httpRequest.request(Method.GET, "/users");
			String responseBody = response.getBody().asString();
			
			System.out.println("Rest sample Value::"+responseBody);
	   }
		
	

}
