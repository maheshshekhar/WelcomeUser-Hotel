package com.mahesh.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahesh.bean.WelcomeUserBean;
import com.mahesh.domain.Customer;

public class RunApp {

	public static void main(String[] args) {

		try{
			System.out.println("=====This is the first client application========");
			
			ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
			System.out.println("Class Path Loaded Successfully!");
			WelcomeUserBean welcomeuserBean = (WelcomeUserBean) context.getBean("welcomeUserBean");
			Customer cust = new Customer();
			cust.setFirstName("Mahesh");
			cust.setLastName("Shekar");
			String str = welcomeuserBean.welcomeUser(cust);
			System.out.println(str);
	}
		catch(Exception e){
			e.printStackTrace();
		}

}
}
