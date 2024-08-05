package com.walmart.food.diary.groceries;

public class MultithreadExecustorService extends Thread {
	
	public void run() {
		System.out.println("i am in run method");
		
		try {
			sleep(1110);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("i am in run method after sleep ");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultithreadExecustorService obj1 = new MultithreadExecustorService();
		//obj1.run();/// not recommended 
		obj1.start();
		

	}

}
