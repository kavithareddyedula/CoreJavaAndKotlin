package com.walmart.food.diary.groceries;

import com.walmart.food.diary.organic.DataTypesDemo;

public class AccessModifiersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DataTypesDemo student2 = new DataTypesDemo();

		String custDetails = student2.createCustomer("ram", "laxman", "test", 2233333);

		System.out.println("custDetails  = " + custDetails);
		
	   DataTypesDemo studentFromSecondClass = new DataTypesDemo();
		
	    int result =	studentFromSecondClass.addTwoInteger(10, 10);
	    System.out.println("student name from second class = "+result);

	}

}
