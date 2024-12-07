package com.actitime.test1;

import com.actiTime.Demo.Payload;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class APIDemo {

	public static void main(String[] args) {
				
		RestAssured.baseURI="https://reqres.in";
		Response response =  RestAssured.given().queryParam("page", 2).
				 when().get("/api/users").then().extract().response();
				response.prettyPrint();
		
		 JsonPath js= new JsonPath(response.asString());
		String total= js.getString("data[2].last_name");
		int number = Integer.parseInt(total);
		char ch[]=total.toCharArray();
		System.out.println(ch);
		for(int i=0;i<total.length();i++) {
			
		}
		System.out.println(total);
		
		
//		Response response=	RestAssured.given()
//		 .body("{\r\n"
//		 		+ "    \"email\": \"eve.holt@reqres.in\",\r\n"
//		 		+ "    \"password\": \"pistol\"\r\n"
//		 		+ "}").when().post("/api/register")
//		 .then().extract().response();
//		response.prettyPrint();
	    
	}

}
