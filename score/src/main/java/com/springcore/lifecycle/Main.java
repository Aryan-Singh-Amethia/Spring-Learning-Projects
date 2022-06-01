package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("file:C:\\Users\\Aryan Singh Amethia\\eclipse-workspace\\score\\src\\main\\resources\\lifecycleconfig.xml");
    context.registerShutdownHook();
	Samosa s1= (Samosa)context.getBean("s1");
	System.out.println(s1);
	Pepsi p1 = (Pepsi)context.getBean("p1");
	System.out.println(p1);
	Bhuja b1 = (Bhuja)context.getBean("b1");
	System.out.println(b1);
	
	}

}
