package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
	ApplicationContext context = new ClassPathXmlApplicationContext("file:C:\\Users\\Aryan Singh Amethia\\eclipse-workspace\\score\\src\\main\\resources\\autowireconfig.xml");
    Emp emp=context.getBean("employee",Emp.class);
    System.out.println(emp);
    
    
	}
}

