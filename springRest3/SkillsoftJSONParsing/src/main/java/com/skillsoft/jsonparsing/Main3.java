package com.skillsoft.jsonparsing;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      System.out.println("*** Creating JSONArray of Diners");
		
		JSONArray dinerList = new JSONArray();
		
		Diner1 diner1 = new Diner1("Sansa Stark", 22, "Female", 153.5f);
		Diner1 diner2 = new Diner1("Arya Stark", 20, "Female", 700.5f);
		
		dinerList.add(diner1);
		dinerList.add(diner2);
		
		System.out.println(dinerList);
		
		try(FileWriter file = new FileWriter("diners3.json")){
			dinerList.writeJSONString(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("*** Writing out JSONArray of Diners");
		

	}

}
