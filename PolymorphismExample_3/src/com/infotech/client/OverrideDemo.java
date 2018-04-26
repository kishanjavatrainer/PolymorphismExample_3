package com.infotech.client;

public class OverrideDemo {

	public static void main(String[] args) {
		
		Child child = new Child(50, 70);
		Parent parent = new Parent(80);
		// calling parent displayData method
		parent.dispayData();
		// parent holding the reference of child
		parent = child;
		// child class displayData method will be called
		parent.dispayData();
	}
}