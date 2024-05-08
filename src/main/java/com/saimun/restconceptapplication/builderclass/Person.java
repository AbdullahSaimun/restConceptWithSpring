package com.saimun.restconceptapplication.builderclass;

public class Person {
	private String name;
	private String fatherName;
	private String motherName;
	private Integer nationalId;

	public Person(PersonBuilder builder) {
		this.name = builder.name;
		this.fatherName = builder.fatherName;
		this.motherName = builder.motherName;
		this.nationalId = builder.nationalId;
	}

	public static class PersonBuilder {
		private String name;
		private String fatherName;
		private String motherName;
		private Integer nationalId;
		public PersonBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public PersonBuilder setFatherName(String fatherName) {
			this.fatherName = fatherName;
			return this;
		}

		public PersonBuilder setMotherName(String motherName) {
			this.motherName = motherName;
			return this;
		}

		public PersonBuilder setNationalId(Integer nationalId) {
			this.nationalId = nationalId;
			return this;
		}
		public Person build() {
			return new Person(this);
		}
	}

	public static void main(String[] args) {
		Person person = new PersonBuilder()
				.setName("x")
				.setFatherName("y")
				.setMotherName("z")
				.setNationalId(323)
				.build();

		System.out.println(STR."My name is \{person.name}, father is \{person.fatherName} and mother name is \{person.motherName}");
	}


}
