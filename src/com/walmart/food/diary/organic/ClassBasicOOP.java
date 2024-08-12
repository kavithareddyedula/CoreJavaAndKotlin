package com.walmart.food.diary.organic;

public class ClassBasicOOP {
	// <public/ protected/ default /private>
	// private == with in the same java class
	// protected with in the same package
	// public == from any package / from any class with in the same project
	// class is logic entity == which functions/ methods which are implemented
	// entity
	// Class public/private/protected class <noun--> start with uppercase every word
	// start with uppcase>{.....}

	// Method --> public/private/protected <returntype>
	// -- object/ any primitive> <start with verb and lowercase every word start
	// with uppcase>(dataype p1,dataype p2)
	// input params syntax == dataype variablename
	// variable syntax : starts noun and other than the first first word every word
	// should start with upper
	// String firstName, String lastName, String houseNumber

	private String getCustomerFirstName(int id) {

		return "sai";
	}

	public String createCustomer(String firstName, String lastName, String houseNumber, int ssn) {

		return "sai";
	}

	protected int addTwoInteger(int a, int b) {

		return a + b;
	}

	public final int addTwoIntegerFinal(int a, int b) {

		return a + b;
	}

	public static double addTwoDecimal(double a, int b) {

		return a + b;
	}

	public static void main(String[] args) {
		// object --> physical entity which is imeplementing the method/functions defined by class(LE)
		
		// <ClassName> <objectname-- starts with lowercase and noun> = new <same class name like left side>()
		
		ClassBasicOOP objectOne = new ClassBasicOOP();
		
		 int result =  objectOne.addTwoInteger(0, 0);
		 System.out.println(result);
		 
	}

}
