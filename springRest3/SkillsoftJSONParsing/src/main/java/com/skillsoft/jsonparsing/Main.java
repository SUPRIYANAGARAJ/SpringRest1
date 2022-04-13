package com.skillsoft.jsonparsing;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class Main {
	
	@SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("**** Creating JSONObject");
		
		JSONObject diner = new JSONObject();
		
		diner.put("name", "Jane Stark");
		diner.put("age", 22);
		diner.put("gender", null);
		diner.put("isAllergic", false);
		diner.put("amountSpent", 153.27);
		
		System.out.println(diner.toJSONString());
		
		try(FileWriter file = new FileWriter("diner.json")){
			diner.writeJSONString(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("**** Writing out JSONObject");
}

}
