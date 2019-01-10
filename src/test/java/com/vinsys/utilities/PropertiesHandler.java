package com.vinsys.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHandler {
	
	//one method accept filelocation and gives that properties
	//one method accept filelocation and key and provides value
	//one method to write into properties - accepts filelocation, key,value
	
	public Properties getProperties(String fileLocation) throws IOException
	{
		FileInputStream file=new FileInputStream(fileLocation);
		Properties prop=new Properties();
		prop.load(file);
		
		return prop;
	}
	
	public String getValueOfProperties(String fileLocation,String key) throws IOException
	{
		FileInputStream file=new FileInputStream(fileLocation);
		Properties prop=new Properties();
		prop.load(file);
		String value=prop.getProperty(key);	
		return value;
	}
	
	public void setPropertiesKeyAndValue(String fileLocation,String key,String value,String comments) throws IOException
	{
		FileInputStream file=new FileInputStream(fileLocation);
		Properties prop=new Properties();
		prop.load(file);
		
		prop.setProperty(key, value);	
		FileOutputStream fOut=new FileOutputStream(fileLocation);
		prop.store(fOut, comments);
	}
	
	

}
