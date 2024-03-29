package com.actitime.test1;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import com.actiTime.Demo.Payload;

public class BasicAPI {
	public static void main(String[] args) {
		RestAssured.baseURI="https://rahulshettyacademy.com/";
	String response=RestAssured.given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(Payload.Addplace()).when().post("maps/api/place/add/json")
		.then()
		.extract().response().asString();
	System.out.println(response);
	
	JsonPath js= new JsonPath(response);
	String placeId=js.getString("status");
	System.out.println(placeId);
	
	//update place
	String newAddress="70 Summer walk, NIMDIH";
	given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
	.body("{\r\n"
			+ "\"place_id\":\""+placeId+"\",\r\n"
			+ "\"address\":\""+newAddress+"\",\r\n"
			+ "\"key\":\"qaclick123\"\r\n"
			+ "}\r\n"
			+ "")
	.when().put("maps/api/place/update/json")
	.then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
	
	//get place
	
	 String getResponce=given().log().all().queryParam("key", "qaclick123")
	.queryParam("place_id", placeId)
	.when().get("maps/api/place/get/json")
	.then().assertThat().statusCode(200).extract().response().asString();
	 
	 JsonPath js1= Payload.rowJson(getResponce);
	// JsonPath js1=new JsonPath(getResponce);
	String actualAdderss= js1.get("address");
	System.out.println(actualAdderss);
	 
	}
	
}


