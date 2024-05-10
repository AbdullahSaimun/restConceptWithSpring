package com.saimun.restconceptapplication.designpattern.singleton;

public class ConfigurationMain {
	public static void main(String[] args) {
		ConfigurationManager configManager = ConfigurationManager.getInstance();
		String databaseUrl = configManager.getProperty("database.url");
		String username = configManager.getProperty("database.username");
		String password = configManager.getProperty("database.password");

		// Use the configuration settings
		System.out.println("Database URL: " + databaseUrl);
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
}
