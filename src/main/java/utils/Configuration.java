package utils;

import java.io.IOException;
import java.util.Properties;

public class Configuration {
	Properties properties;

	public String getProps(String x) {
		return properties.getProperty(x);
	}

	public Configuration()  {
		properties = new Properties();
		loadProperties();
	}
	
	
	void loadProperties(){
		try {
			properties.load(getClass().getClassLoader().getResourceAsStream("configuration.properties"));
		} catch (IOException e) {
		}
		
	}
}
