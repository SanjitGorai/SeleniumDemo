package com.actiTime.Demo;

import io.restassured.path.json.JsonPath;

public class Payload{
	
public static String Addplace () {
	
	return "{\r\n"
			+ "  \"location\": {\r\n"
			+ "    \"lat\": -38.383494,\r\n"
			+ "    \"lng\": 33.427362\r\n"
			+ "  },\r\n"
			+ "  \"accuracy\": 50,\r\n"
			+ "  \"name\": \"Sanjit  house\",\r\n"
			+ "  \"phone_number\": \"(+91) 8637048693 \",\r\n"
			+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
			+ "  \"types\": [\r\n"
			+ "    \"shoe park\",\r\n"
			+ "    \"shop\"\r\n"
			+ "],\r\n"
			+ "  \"website\": \"http://google.com\",\r\n"
			+ "  \"language\": \"French-IN\"\r\n"
			+ "}\r\n"
			+ "";
	
	}
  public static JsonPath rowJson(String response) {
	  JsonPath js1=new JsonPath(response);
	  return js1;
  }
	
}

