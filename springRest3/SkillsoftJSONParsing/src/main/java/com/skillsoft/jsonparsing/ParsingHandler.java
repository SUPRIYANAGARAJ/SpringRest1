package com.skillsoft.jsonparsing;

import java.io.IOException;

import org.json.simple.parser.ContentHandler;
import org.json.simple.parser.ParseException;

public class ParsingHandler implements ContentHandler {

	@Override
	public void startJSON() throws ParseException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Start");
		
	}

	@Override
	public void endJSON() throws ParseException, IOException {
		// TODO Auto-generated method stub
		System.out.println("End");
	}

	@Override
	public boolean startObject() throws ParseException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Start Object");
		return true;
	}

	@Override
	public boolean endObject() throws ParseException, IOException {
		// TODO Auto-generated method stub
		System.out.println("End Object");
		return true;
	}

	@Override
	public boolean startObjectEntry(String s) throws ParseException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Start Object Entry: " + s);
		return true;
	}

	@Override
	public boolean endObjectEntry() throws ParseException, IOException {
		// TODO Auto-generated method stub
		System.out.println("End object Entry");
		return true;
	}

	@Override
	public boolean startArray() throws ParseException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Start Array");
		return true;
	}

	@Override
	public boolean endArray() throws ParseException, IOException {
		// TODO Auto-generated method stub
		System.out.println("End Array");
		return true;
	}

	@Override
	public boolean primitive(Object o) throws ParseException, IOException {
		// TODO Auto-generated method stub
		System.out.println("---" + o + "----");
		return true;
	}

}
