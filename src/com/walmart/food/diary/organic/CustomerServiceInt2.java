package com.walmart.food.diary.organic;

public interface CustomerServiceInt2 {
	
	 String  getGreetings2(String name); // public and abstract 
	
    // jdk1.8 interface can also support default or static methods
	public default String  getGreetings(String name) {

		return "Hi welcome "+name;
	}

}
