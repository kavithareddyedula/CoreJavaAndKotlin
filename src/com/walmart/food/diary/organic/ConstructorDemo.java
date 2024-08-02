package com.walmart.food.diary.organic;

public class ConstructorDemo {
	
	// constructor == creating the object === heap memory 
	
	// java class name (){} === default constructor == created / supported by jvm 
	//
	
	public ConstructorDemo(){
		System.out.println("i am from default constructor ");
		
	}
	// costum constructor 
	
	public ConstructorDemo(int p1, int p2){
		super();
		
		//ConstructorDemo	obj2 = new ConstructorDemo(); // default constructor 
	    
		
		System.out.println("i am from costum constructor "+p1);
		//super();
		
	}
	
	

	public static void main(String[] args) {
		/*ConstructorDemo obj1 = new ConstructorDemo();
		
		System.out.println("memory address  "+obj1.hashCode());
		*/
		
        ConstructorDemo obj2 = new ConstructorDemo(10,12);
		
		System.out.println("memory address  "+obj2.hashCode());
		

	}

}
