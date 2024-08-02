package com.walmart.food.diary.organic;

public class CusomterServiceImpl implements CustomerServiceInt {

	@Override
	public String getCustomerName(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCustomerDetails(String firstName) {
	
		System.out.println("firstName  = " + firstName);
		
		
	}
	
	
	public static void main(String[] args) {
		
		CusomterServiceImpl cust1 = new CusomterServiceImpl();
		
		cust1.updateCustomerDetails("ram");
	}

}
