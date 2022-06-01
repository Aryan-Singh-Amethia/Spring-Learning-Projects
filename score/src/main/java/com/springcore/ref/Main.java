package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("file:C:\\Users\\Aryan Singh Amethia\\eclipse-workspace\\score\\src\\main\\resources\\refconfig.xml");
        A a=(A)context.getBean("refA");
        System.out.println(a.getName());
        System.out.println(a.getObj().getNum());
	}

}
