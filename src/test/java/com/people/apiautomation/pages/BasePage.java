package com.people.apiautomation.pages;




import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class BasePage {
	
	 
		public static RequestSpecification _REQUEST_SPEC;
		public static Response _RESP;
	
    
    
	public void responsebody() {
		// Retrieve the body of the Response
		@SuppressWarnings("rawtypes")
		ResponseBody body = _RESP.getBody();
		// To check for sub string presence get the Response body as a String.
		// Do a String.contains
		String bodyAsString = body.asString();
		System.out.println("body::::"+bodyAsString);
	}
	 
}
