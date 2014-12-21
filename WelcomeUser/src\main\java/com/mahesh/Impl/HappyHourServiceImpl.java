package com.mahesh.Impl;

import com.mahesh.domain.Customer;
import com.mahesh.interfaces.HappyHourService;

public class HappyHourServiceImpl implements HappyHourService {

	@Override
	public String welcomeUser(Customer cust){
		return "Welcome" + cust.getFirstName() + " "+ cust.getLastName()+ "You are Eligible for a Happy Meal!" ;
	}
}
