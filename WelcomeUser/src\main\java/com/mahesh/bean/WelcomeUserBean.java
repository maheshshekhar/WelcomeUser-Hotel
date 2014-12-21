package com.mahesh.bean;

import java.util.Calendar;

import com.mahesh.domain.Customer;
import com.mahesh.interfaces.HappyHourService;
import com.mahesh.interfaces.StandardHourService;

public class WelcomeUserBean {
	public Customer name;
	public HappyHourService happyHourService;
	public StandardHourService standardHourService;
	
	public void setHappyHourService(HappyHourService happyHourService) {
		this.happyHourService = happyHourService;
	}
	public void setStandardHourService(StandardHourService standardHourService) {
		this.standardHourService = standardHourService;
	}
	
	public Customer getName() {
		return name;
	}
	public void setName(Customer name) {
		this.name = name;
	}
	
	public String welcomeUser(Customer cust){
		Calendar calendar = Calendar.getInstance();
		if(calendar.get(Calendar.HOUR_OF_DAY) >= 9 && calendar.get(Calendar.HOUR_OF_DAY) <=10)
		{
			return happyHourService.welcomeUser(cust);
		}else
		{
			return standardHourService.welcomeUser(cust);
		}
	}
	
}
