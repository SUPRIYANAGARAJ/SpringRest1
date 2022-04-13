package com.skillsoft.jsonparsing;

import java.util.Map;
import java.util.TreeMap;

import org.json.simple.JSONValue;

public class SortedMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("*** Creating JSONObject");
		
		Map<String, Object> movie = new TreeMap<>();
		
		movie.put("name", "Back to the Future");
		movie.put("releaseYear", 1985);
		movie.put("boxOffice", 388.8);
		movie.put("director", "Robert Zemeckis");
		
		System.out.println((JSONValue.toJSONString(movie)));
		
		System.out.println("*** Predictable ordering string encoding ofJSON object");
		
	}

}
