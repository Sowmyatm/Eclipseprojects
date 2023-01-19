package tests;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
//import io.restassured.response.Response;

public class RestAPISession extends BaseTest{
	
	static Response res;
	 String token=null;

	@Test
	public void login() {
		
		RestAssured.baseURI="https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net";
//		Response res =RestAssured.given().header("Content-Type","application/json").when()
//				.body("{\"username\":\"sowmyat.nov22@ta.com\",\"password\":\"sowmyat123\"}").post("/login");
//		OR
		
		Response res =RestAssured.given().when().header("Content-Type","application/json")
				.body("{\"username\":\"sowmyat.nov22@ta.com\",\"password\":\"sowmyat123\"}").post("/login")
				.then().assertThat().statusCode(201).extract().response();	
		System.out.println(res.asPrettyString());
		
		 token =res.jsonPath().getString("token").replace("[", "").replace("]", "");
		
		System.out.println(token);
//		Response resGet =RestAssured.given().when().header("Content-Type","application/json")
//				.header("token", token).get("/getdata");	
//		
//		
//		
//		System.out.println(resGet.asPrettyString());
	}

	@Test(dependsOnMethods= {"login"})
	public void getdata() {
	
//		RestAssured.baseURI="https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net";
//		HashMap<String,String> loginAccount = new HashMap<String,String>();
//		loginAccount.put("username", "sowmyat.nov22@ta.com");
//		loginAccount.put("password", "sowmyat123");
//		
////	Response res =RestAssured.given().header("Content-Type","application/json").when()
////			.body("{\"username\":\"sowmyat.nov22@ta.com\",\"password\":\"sowmyat123\"}").post("/login");
////	OR
//	
//		Response res =RestAssured.given().when().header("Content-Type","application/json")
//					.body(loginAccount).post("/login")
//					.then().assertThat().statusCode(201).extract().response();	
//		System.out.println(res.asPrettyString());
//	
//		String token =res.jsonPath().getString("token").replace("[", "").replace("]", "");
//	
//		System.out.println(token);
//		
		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		headers.put("token", token);
		System.out.println(token);
		Response resGet =RestAssured.given().when().headers(headers).get("/getdata").then().assertThat().statusCode(200).extract().response();	
	System.out.println(resGet.asPrettyString());
}
	
	@Test(dependsOnMethods= {"login"})
	public void addData() {
	
//		RestAssured.baseURI="https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net";
////	Response res =RestAssured.given().header("Content-Type","application/json").when()
////			.body("{\"username\":\"sowmyat.nov22@ta.com\",\"password\":\"sowmyat123\"}").post("/login");
////	OR
//	
//		Response res =RestAssured.given().when().header("Content-Type","application/json")
//					.body("{\"username\":\"sowmyat.nov22@ta.com\",\"password\":\"sowmyat123\"}").post("/login")
//					.then().assertThat().statusCode(201).extract().response();	
//		System.out.println(res.asPrettyString());
//	
//		String token =res.jsonPath().getString("token").replace("[", "").replace("]", "");
//	
		System.out.println(token);
		
		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		headers.put("token", token);
		System.out.println(token);
		HashMap<String, String> body = new HashMap<String, String>();
		body.put("accountno", "TA-90909092");
		body.put("departmentno","9");
		body.put("salary", "90000");
		body.put("pincode", "909090");
		
		
		Response resadd =RestAssured.given().when().headers(headers).post("/addData");	
	System.out.println(resadd.asPrettyString());
}
}


		
	
