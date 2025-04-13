package com.project.hrm.generic.FileUtility;

import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class SimpleJSONUtility {

	/**
	 * This is a generic utility method for fetching data from json file through json-simple dependecy
	 * @param key
	 * @return
	 * @throws IOException
	 * @throws ParseException 
	 */
	public String getDataFromJsonFile(String key) throws IOException, ParseException
	{
		JSONParser jParse = new JSONParser();
		Object object = jParse.parse(new FileReader(IPathUtility.jsonFilePath));
		JSONObject jObj = new JSONObject(object);
		return jObj.getString(key);
	}
}
