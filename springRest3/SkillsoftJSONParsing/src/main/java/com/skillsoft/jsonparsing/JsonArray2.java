package com.skillsoft.jsonparsing;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

@SuppressWarnings("unchecked")
public class JsonArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println("**** Creating JSONArray of JSONObjects");
		
		JSONObject dinerListObject = new JSONObject();
		
		JSONArray dinerList = new JSONArray();
		
		JSONObject diner1 = new JSONObject();
		diner1.put("name", "Jane Stark");
		diner1.put("age", 22);
		diner1.put("gender", "Female");
		diner1.put("isAllergic", false);
		diner1.put("amountSpent", 153.27);
		
		JSONObject diner2 = new JSONObject();
		diner2.put("name", "Jon Snow");
		diner2.put("age", 25);
		diner2.put("amountSpent", 750.5);
		
		dinerList.add(diner1);
		dinerList.add(diner2);
		
		dinerListObject.put("diners", dinerList);
		
		System.out.println(dinerListObject);
		
		try(FileWriter file = new FileWriter("diners.json")){
			dinerListObject.writeJSONString(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("**** Writing out JSONArray of JSONObjects");


	}

}
