package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("file:C:\\Users\\Aryan Singh Amethia\\eclipse-workspace\\score\\src\\main\\resources\\ci.xml");
        Student stud1=(Student)context.getBean("stud1");
        System.out.println(stud1);
	}

}
