package com.skillsoft.jsonparsing;

import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONObject;

public class JsonStreamEncode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
     System.out.println("*** Creating JSONObject");
		
		JSONObject movie = new JSONObject();
		
		movie.put("name", "Back to the Future");
		movie.put("releaseYear", 1985);
		movie.put("boxOffice", 388.8);
		movie.put("director", "Robert Zemeckis");
		
		StringWriter out = new StringWriter();
		movie.writeJSONString(out);
		
		System.out.println(out.toString());
		
		System.out.println("*** Stream encoding ofJSON object");

	}

}
