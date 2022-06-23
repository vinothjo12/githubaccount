package org.step;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {

	@Before(order = 2)
	public void beforeScenario() {
		date();
	}

	@Before(order = 1)
	public void beforeScenario1() {
		System.out.println("scenario starts at");
	}

	@Before(order = 3)
	public void beforeScenario2() {
		System.out.println("morning");
	}

	@After(order = 2)
	public void afterScenario() {
		date();

	}

	@After(order = 3)
	public void afterScenario1() {
		System.out.println("scenario ends at");

	}

	@After(order = 1)
	public void afterScenario2() {
		System.out.println("aftnun");
		System.out.println("evening");
		System.out.println("eve");
		System.out.println("forenun");

	}
}
