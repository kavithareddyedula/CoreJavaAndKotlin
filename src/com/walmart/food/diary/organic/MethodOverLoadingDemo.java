package com.walmart.food.diary.organic;

import java.util.Arrays;

import com.walmart.food.diary.organic.domain.Address;
import com.walmart.food.diary.organic.domain.Customer;

public class MethodOverLoadingDemo {

	public Customer findCustomer(String firstName, String lastName) {

		Customer cust = new Customer();

		cust.setFirstName(firstName);
		cust.setLastName(lastName);

		Address add1 = new Address();

		add1.setHouseNumber("1233");
		cust.setAddressList(Arrays.asList(add1));

		// DB --> results

		return cust;

	}

	public Customer findCustomer(int id) {

		Customer cust = new Customer();

		cust.setFirstName("test");
		cust.setLastName("testlastname");

		Address add1 = new Address();

		add1.setHouseNumber("1233");
		cust.setAddressList(Arrays.asList(add1));

		// DB --> results

		return cust;

	}

	public Customer findCustomer(Address add) {

		Customer cust = new Customer();

		cust.setFirstName("test");
		cust.setLastName("testlastname");

		cust.setAddressList(Arrays.asList(add));

		// DB --> results

		return cust;

	}

	public Customer findCustomer(String lastName, int id) {

		Customer cust = new Customer();

		cust.setFirstName("test");
		cust.setId(id);
		cust.setLastName(lastName);

		Address add1 = new Address();

		add1.setHouseNumber("1233");
		cust.setAddressList(Arrays.asList(add1));

		// DB --> results

		return cust;

	}

	public static void main(String[] args) {

		MethodOverLoadingDemo obj = new MethodOverLoadingDemo();

		Customer cust = obj.findCustomer(200);

		System.out.println(cust.getLastName());
		Customer cust1 = obj.findCustomer("test", 200);

		System.out.println(cust1.getFirstName());

	}

}
