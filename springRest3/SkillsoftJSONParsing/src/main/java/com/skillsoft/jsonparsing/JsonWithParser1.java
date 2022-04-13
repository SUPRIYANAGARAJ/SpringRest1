package com.skillsoft.jsonparsing;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.parser.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

public class JsonWithParser1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   System.out.println("**** Reading very large JSON file");
	   
	   JSONParser jsonParser = new JSONParser();
	     
	   try (FileReader reader = new FileReader("src/test/java/employees.json")){
		   Object obj = jsonParser.parse(reader);
		   
		   ParsingHandler parsingHandler = new ParsingHandler();
		   
		   JSONArray jsonObject = (JSONArray) obj;
		   System.out.println(jsonObject);
		   
		   jsonParser.parse(obj.toString(), parsingHandler, true);
        	
        }
     catch (IOException | ParseException e) {
		e.printStackTrace();
	}
	
	System.out.println("**** Completed reading JSON");
	}

	}


