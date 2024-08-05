package com.walmart.food.diary.groceries;

public class RunnableIntDemo  implements Runnable{
	
	@Override
	public void run() {
		System.out.println("i am in run method");
		
	}
	

	public static void main(String[] args) {
		
		Runnable  runObj = new RunnableIntDemo();
		
		Thread tObj = new Thread(runObj);
		
		tObj.start();

	}

}
