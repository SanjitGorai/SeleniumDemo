package com.actitime.test1;


import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import com.actiTime.Demo.Payload;

public class BasicAPI {
	public static void main(String[] args) {
		RestAssured.baseURI="https://rahulshettyacademy.com/";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(Payload.Addplace()).when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200);
	}
	
}


