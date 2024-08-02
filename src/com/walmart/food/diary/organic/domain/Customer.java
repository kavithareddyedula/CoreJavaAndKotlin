package com.walmart.food.diary.organic.domain;

import java.util.List;


public class Customer {
	// pojo /domain object/ DTO = data transfer / value object VO
	// lombok // builder // setter /getter 

	private int id;
	private String firstName;
	private String lastName;
	private List<Address> addressList;

	// Setter and getter methods syntax --> set/get<propertyname-> should start with
	// upper case >
	// setter return type is void , input param should be your private property data
	// type
	// getter return type is based on private property data type
	// this == keyword refers to the current object
	public void setId(int identity) {

		this.id = identity;

	}

	public int getId() {

		return id;

	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;

	}

	public String getFirstName() {

		return firstName;

	}

	public void setLastName(String lastName) {

		this.lastName = lastName;

	}

	public String getLastName() {

		return lastName;

	}

	public void setAddressList(List<Address> addressList) {

		this.addressList = addressList;

	}

	public List<Address> getaddressList() {

		return addressList;

	}

}
