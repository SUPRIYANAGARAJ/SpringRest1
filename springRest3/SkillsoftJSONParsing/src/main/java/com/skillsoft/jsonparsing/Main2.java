package com.skillsoft.jsonparsing;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;

public class Main2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("*** Creating JSONArray of Diners");
		
		JSONArray dinerList = new JSONArray();
		
		Diner diner1 = new Diner("Jane Stark", 22, "Female", 153.5f);
		Diner diner2 = new Diner("Jon Snow", 24, "Male", 767.5f);
		
		dinerList.add(diner1);
		dinerList.add(diner2);
		
		System.out.println(dinerList);
		
		try(FileWriter file = new FileWriter("diners2.json")){
			dinerList.writeJSONString(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("*** Writing out JSONArray of Diners");
		
		
		

	}

}
