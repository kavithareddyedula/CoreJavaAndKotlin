package com.walmart.food.diary.organic;

public class AbstractDemoImpl extends AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractDemoImpl obj1 = new AbstractDemoImpl();
		System.out.println(obj1.getCustomerName(0));
		
		obj1.updateCustomerDetails("testfirstname");

	}

	@Override
	public void updateCustomerDetails(String firstName) {
		System.out.println("I am from AbstractDemoImpl  = ");
	}

}
