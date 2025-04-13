package com.project.hrm.generic.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class PropertiesUtility {
	/**
	 * This is a generic method to get String type data from properties file based on relevant key.
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getDataFromPropertiesFile(String key) throws IOException
	{
		FileInputStream file = new FileInputStream(IPathUtility.propertyFilePath);
		Properties prop = new Properties();
		prop.load(file);
		String value = prop.getProperty(key);
		return value;
	}
	
}
