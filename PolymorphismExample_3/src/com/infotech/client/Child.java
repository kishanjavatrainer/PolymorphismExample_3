package com.infotech.client;

public class Child extends Parent {
	private int j;

	// Constructor
	public Child(int i, int j) {
		// Calling parent class constructor
		super(i);
		this.j = j;
	}

	// Overridden Method
	@Override
	public void dispayData() {
		System.out.println("Value of j " + j);
	}
}
