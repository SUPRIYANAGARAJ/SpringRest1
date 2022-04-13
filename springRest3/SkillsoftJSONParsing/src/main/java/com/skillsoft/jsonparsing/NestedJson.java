package com.skillsoft.jsonparsing;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class NestedJson {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("**** Creating JSONObjects");
		
		JSONObject dinerListObject = new JSONObject();
		
		JSONArray dinerList = new JSONArray();
		
		JSONObject diner1 = new JSONObject();
		diner1.put("name", "Jane Stark");
		diner1.put("age",22);
		diner1.put("gender", "Female");
		diner1.put("isAllergic", false);
		diner1.put("amountSpent", 153.27);

		
		JSONArray contactList = new JSONArray();
		JSONObject contact1 = new JSONObject();
		
		contact1.put("type", "home");
		contact1.put("number", "212-555-1234");
		
        JSONObject contact2 = new JSONObject();
		
		contact2.put("type", "mobile");
		contact2.put("number", "646-555-4567");
		
		contactList.add(contact1);
		contactList.add(contact2);
		
		diner1.put("contact", contactList);
		
		dinerList.add(diner1);
		
		dinerListObject.put("diners", dinerList);
		
		System.out.println(dinerListObject);
		
		try(FileWriter file = new FileWriter("diners1.json")){
			dinerListObject.writeJSONString(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("**** Writing out JSONArray of JSONObjects");

	}

}
