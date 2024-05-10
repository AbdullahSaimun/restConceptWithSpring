package com.saimun.restconceptapplication.designpattern.singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationManager {
	private static ConfigurationManager instance;
	private Properties properties;

	// Private constructor to prevent instantiation from outside
	private ConfigurationManager() {
		loadConfiguration();
	}

	// Method to get the instance of ConfigurationManager class
	public static ConfigurationManager getInstance() {
		if (instance == null) {
			instance = new ConfigurationManager();
		}
		return instance;
	}

	// Method to load configuration settings from a file
	private void loadConfiguration() {
		properties = new Properties();
		try {
			properties.load(new FileInputStream("config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Method to get a configuration setting by key
	public String getProperty(String key) {
		return properties.getProperty(key);
	}
}

//In this example, the ConfigurationManager class loads configuration settings from a config.properties file.
// By making the ConfigurationManager a Singleton, we ensure that there's only one instance throughout the
// application, and all parts of the application can access the loaded configuration settings through this
// single instance.

