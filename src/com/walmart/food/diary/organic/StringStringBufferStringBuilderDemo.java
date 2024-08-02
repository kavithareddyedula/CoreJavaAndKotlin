package com.walmart.food.diary.organic;

public class StringStringBufferStringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String cust = "ram"; // String literal == stores into the string pool
		
		//String class --> which is final class --> non modifiable / immutable

		System.out.println(cust);
		System.out.println(cust.hashCode());// memory address == abandoned 

		cust = "sai";// String literal == stores into the string pool

		System.out.println(cust);
		System.out.println(cust.hashCode());// new memory  --> id 
		
		
		/// heap memory === new keyword 
		
		
		String custNewKey = new String("ram111");
		
		System.out.println(custNewKey);
		System.out.println(custNewKey.hashCode());
		
		// StringBuffer 
		
		StringBuffer custBuf = new StringBuffer();
		
		custBuf.append("test");
		System.out.println(custBuf);
		System.out.println(custBuf.hashCode());
		

		
		custBuf.append("test111");
		
		System.out.println("after change "+custBuf);
		System.out.println(custBuf.hashCode()); // same memory location // methods are synchronized 
		

	   // StringBuilder == methods are asynchonized // jdk 1.5
		
		StringBuilder custBuilder = new StringBuilder();
		
		custBuilder.append("test2222");
		System.out.println(custBuilder);
		System.out.println(custBuilder.hashCode());
		

		
		custBuilder.append("test3333");
		
		System.out.println("after change "+custBuilder);
		System.out.println(custBuilder.hashCode()); // same memory location // methods are synchronized 
		
	}

}
