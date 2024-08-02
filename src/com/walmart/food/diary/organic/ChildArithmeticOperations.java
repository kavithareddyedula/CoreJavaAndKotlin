package com.walmart.food.diary.organic;

public class ChildArithmeticOperations extends ParentArithmeticOperations,ParentArithmeticOperations2{
	
	// Development time = 
	// testing time 
	// confidence 
	// inheritance = parent child  == extends key word 
	//  ChildArithmeticOperations extends ParentArithmeticOperations
	// java does not suuport to extend multiple classes 

	public static void main(String[] args) {
		ChildArithmeticOperations childObj1 = new ChildArithmeticOperations();
		
		  int result = childObj1.addTwoIntegerFinal(10 ,20);
		  
		  System.out.println(result);
		  
	}

}
