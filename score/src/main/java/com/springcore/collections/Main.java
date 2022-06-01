package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("file:C:\\Users\\Aryan Singh Amethia\\eclipse-workspace\\score\\src\\main\\resources\\collectionconfig.xml");
//		Emp emp1= (Emp)context.getBean("emp1");
//        System.out.println(emp1.getEmpName());
//        System.out.println(emp1.getProps());
		
		ApplicationContext context = new ClassPathXmlApplicationContext("file:C:\\Users\\Aryan Singh Amethia\\eclipse-workspace\\score\\src\\main\\resources\\aloneconfig.xml");
		Emp emp1= context.getBean("emp1",Emp.class);
        System.out.println(emp1);
	}

}
