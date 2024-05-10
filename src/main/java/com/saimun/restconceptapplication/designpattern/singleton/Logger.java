package com.saimun.restconceptapplication.designpattern.singleton;

public class Logger {

	private static Logger instance; // Private static variable to hold the single instance

	private Logger() {} // Private constructor to prevent direct instantiation

	public static Logger getInstance() {
		if (instance == null) {
			synchronized (Logger.class) { // Thread safety for multithreaded environments
				if (instance == null) {
					instance = new Logger();
				}
			}
		}
		return instance;
	}

	// Methods specific to the Logger functionality
	public void log(String message) {
		// Implementation for logging the message
		System.out.println(message);
	}
}