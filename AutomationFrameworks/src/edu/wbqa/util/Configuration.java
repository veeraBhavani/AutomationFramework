package edu.wbqa.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class Configuration {
public static HashMap<String,String> loadSettings() throws Exception
{
	HashMap<String,String> settings=new HashMap<String,String>();
	Properties p=new Properties();
	p.load(new FileReader(new File("settings.properties")));
	for(Object key : p.keySet())
	{
		settings.put((String) key, p.getProperty((String) key));
	}
	return settings;
	
	
}
}
