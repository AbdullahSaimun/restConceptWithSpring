package com.saimun.restconceptapplication.builderclass;

public class CarBuilderTest {
	private String make;
	private String model;
	private Integer year;

	public CarBuilderTest(Builder builder) {
		this.make = builder.make;
		this.model = builder.model;
		this.year = builder.year;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public Integer getYear() {
		return year;
	}

	public static class Builder {
		private String make;
		private String model;
		private Integer year;

		public Builder make(String make) {
			this.make = make;
			return this;
		}

		public Builder model(String model) {
			this.model=model;
			return this;
		}

		public Builder year(Integer year) {
			this.year = year;
			return this;
		}

		public CarBuilderTest build() {
			return new CarBuilderTest(this);
		}
	}

	public static void main(String[] args) {
		CarBuilderTest cb = new Builder()
				.make("bmw")
				.model("cc")
				.year(32).build();
		System.out.println(cb.make);
		System.out.println(cb.model);
		System.out.println(cb.year);
	}
}
