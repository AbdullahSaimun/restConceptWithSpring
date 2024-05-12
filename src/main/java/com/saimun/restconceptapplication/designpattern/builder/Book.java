package com.saimun.restconceptapplication.designpattern.builder;

public class Book {
	private String name;
	private String author;

	public Book(Builder builder) {
		this.name = builder.name;
		this.author = builder.author;
	}

	public static class Builder {
		private String name;
		private String author;

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder author(String author) {
			this.author = author;
			return this;
		}

		public Book build() {
			return new Book(this);
		}
	}

	public static void main(String[] args) {
		Book book = new Book.Builder().name("fire").author("author").build();
		System.out.println(STR."\{book.name}, \{book.author}");
	}
}
