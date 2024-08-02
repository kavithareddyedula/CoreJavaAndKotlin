package com.walmart.food.diary.organic;

// parent and child relationship== extends keyword 

public class CompileTimeOrMethodOverloadingDemo  extends ParentMethodOverloading{
	
	// method override  == compile time polimorphism 
	public int addTwoIntegerFinal(int a, int b) {
		

		return a + b;
	}
	

	public static void main(String[] args) {
	
		CompileTimeOrMethodOverloadingDemo  childObj = new CompileTimeOrMethodOverloadingDemo();
		
		int resul =childObj.addTwoIntegerFinal(10, 10); // child class method 
		
		System.out.println(resul);
		
		
		
		ParentMethodOverloading  parentObj = new ParentMethodOverloading();
		
		int result = parentObj.addTwoIntegerFinal(10, 10);// parent class method 
		
		System.out.println(result);
		

	}

}
