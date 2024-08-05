package com.walmart.food.diary.groceries;

import java.util.concurrent.Callable;

public class CallableIntDemo implements Callable<CallableIntDemo>{
	
	@Override
	public CallableIntDemo call() throws Exception {
		System.out.println("i am in run method");
		return null;
	}
	
	
	public static void main(String[] args) throws Exception {
		
		Callable<CallableIntDemo>  runObj = new CallableIntDemo();
		
		runObj.call();

	}

	

}
