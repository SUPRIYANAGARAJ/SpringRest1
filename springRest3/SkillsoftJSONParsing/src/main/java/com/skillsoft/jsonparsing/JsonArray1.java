package com.skillsoft.jsonparsing;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("**** Reading JSON");
		
        try(FileReader reader = new FileReader("diners.json")){
			
			JSONArray dinerList = (JSONArray) JSONValue.parse(reader);
			System.out.println(dinerList);
			
			for (Object object : dinerList) {
				JSONObject diner = (JSONObject) object;
				
				System.out.println("\n**** Diner");
				
				String name = (String) diner.get("name");
				System.out.println("\ndiner name: " + name);
				
				String gender = (String) diner.get("gender");
				System.out.println("\ndiner gender: " + gender);
				
				long age = (long) diner.get("age");
				System.out.println("\ndiner age: " + age);
				
				double amountSpent = (double) diner.get("amountSpent");
				System.out.println("diner spending: " + amountSpent);
				
				Boolean isAllergic = (Boolean) diner.get("isAllergic");
				System.out.println("diner isAllergic: " + isAllergic);
			}
				
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			System.out.println("*** Completed reading JSON");

				
			}
	}

