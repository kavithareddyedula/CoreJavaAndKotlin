package com.walmart.food.diary.organic;

public class MultipleInheritance implements  CustomerServiceInt,CustomerServiceInt2 {

	public static void main(String[] args) {
		MultipleInheritance obj1 = new MultipleInheritance();
		String result =obj1.getGreetings("rama");
		System.out.println(result);

	}

	@Override
	public String getGreetings2(String name) {
		
		return "core java interview prepation with programs ";
	}

	@Override
	public String getCustomerName(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCustomerDetails(String firstName) {
		// TODO Auto-generated method stub
		
	}

}
