package com.saimun.restconceptapplication.builderclass;

public class User {
	private final String username;
	private final String email;
	private final int age;
	private final String address;

	// Private constructor to enforce object creation through builder
	private User(Builder builder) {
		this.username = builder.username;
		this.email = builder.email;
		this.age = builder.age;
		this.address = builder.address;
	}

	// Getters
	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	// Builder class
	public static class Builder {
		private final String username; // Mandatory
		private final String email; // Mandatory
		private int age; // Optional
		private String address; // Optional

		// Constructor with mandatory parameters
		public Builder(String username, String email) {
			this.username = username;
			this.email = email;
		}

		// Setter methods for optional parameters, returning Builder instance for chaining
		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Builder address(String address) {
			this.address = address;
			return this;
		}

		// Build method to create User instance
		public User build() {
			return new User(this);
		}
	}

	// Example usage
	public static void main(String[] args) {
		User user = new User.Builder("john_doe", "john@example.com")
				.age(30)
				.address("123 Main St, Anytown, USA")
				.build();

		// Accessing user properties
		System.out.println("Username: " + user.getUsername());
		System.out.println("Email: " + user.getEmail());
		System.out.println("Age: " + user.getAge());
		System.out.println("Address: " + user.getAddress());
	}
}

