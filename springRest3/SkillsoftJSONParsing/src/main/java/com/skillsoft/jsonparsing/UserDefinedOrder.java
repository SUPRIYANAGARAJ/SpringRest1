package com.skillsoft.jsonparsing;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import org.json.simple.JSONValue;

public class UserDefinedOrder {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("*** Creating JSONObject");
		
		Map<String, Object> movie = new TreeMap<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2) * -1;
			}
		});
		
		movie.put("name", "Back to the Future");
		movie.put("releaseYear", 1985);
		movie.put("boxOffice", 388.8);
		movie.put("director", "Robert Zemeckis");
		
		StringWriter out = new StringWriter();
		JSONValue.writeJSONString(movie, out);
		
		System.out.println(out.toString());
		
		System.out.println("*** Predictable ordering string encoding ofJSON object");
		

		
	}

}
