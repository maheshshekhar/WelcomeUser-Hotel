package com.mahesh.Impl;

import com.mahesh.domain.Customer;
import com.mahesh.interfaces.StandardHourService;

public class StandardHourServiceImpl implements StandardHourService {

	@Override
	public String welcomeUser(Customer cust){
		return "Welcome " + cust.getFirstName()+" "+ cust.getLastName()+ " "+ "You are Eligible for a Standard Meal!";
		
	}
}
