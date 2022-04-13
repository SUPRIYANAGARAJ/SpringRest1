package com.skillsoft.jsonparsing;

import org.json.simple.JSONObject;

public class JsonStringEncode {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*** Creating JSONObject");
		
		JSONObject movie = new JSONObject();
		
		movie.put("name", "Back to the Future");
		movie.put("releaseYear", 1985);
		movie.put("boxOffice", 388.8);
		movie.put("director", "Robert Zemeckis");
		
		System.out.println(movie.toString());
		System.out.println(movie.toJSONString());
		
		System.out.println("***** String encoding ofJSON object");
		

	}

}
