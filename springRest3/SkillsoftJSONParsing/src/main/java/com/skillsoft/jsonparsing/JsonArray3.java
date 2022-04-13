package com.skillsoft.jsonparsing;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonArray3 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("**** Reading JSON");
		
		try (FileReader reader = new FileReader("diners.json")){
			
			JSONObject dinerListObject = (JSONObject) JSONValue.parse(reader);
			System.out.println(dinerListObject);
			
			JSONArray dinerList = (JSONArray) dinerListObject.get("diners");
			
			for(Object object : dinerList) {
				JSONObject diner = (JSONObject) object;
				
				System.out.println("\n**** Diner");
				
				for (Object field: diner.entrySet()) {
					System.out.println(field);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("**** Completed reading JSON");
		
	}

}
