package com.saimun.restconceptapplication.stringTemplate;

import static java.lang.StringTemplate.RAW;

public class StringTemplateExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;

		var st = RAW."\{x} + \{y} = {x+y}";
		System.out.println(st);
		System.out.println(st.fragments());
		var re = st.process(STR);
		System.out.println(re);

		String student = "Mary";
		String teacher = "Johnson";

		StringTemplate st2 = RAW."The student \{student} is in \{teacher}'s room";
		System.out.println(st2.interpolate());

	}
}
