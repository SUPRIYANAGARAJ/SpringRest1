package com.skillsoft.jsonparsing;

import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONAware;
import org.json.simple.JSONStreamAware;
import org.json.simple.JSONValue;

public class Diner1 implements JSONStreamAware {
	
	private String name;
	private int age;
	private String gender;
	private float amountSpent;
	
	
	public Diner1(String name, int age, String gender, float amountSpent) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.amountSpent = amountSpent;
	} {

}

	@Override
	public void writeJSONString(Writer writer) throws IOException {
		// TODO Auto-generated method stub
		
		Map<String, Serializable> map = new LinkedHashMap<String, Serializable>();
		
		map.put("name", name);
		map.put("age", age);
		map.put("gender", gender);
		map.put("amountSpent", amountSpent);
		
		JSONValue.writeJSONString(map, writer);
		
	}
}
