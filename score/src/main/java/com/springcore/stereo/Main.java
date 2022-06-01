package com.springcore.stereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("file:C:\\Users\\Aryan Singh Amethia\\eclipse-workspace\\score\\src\\main\\resources\\stereoconfig.xml");
		Student student=context.getBean("student",Student.class);
		System.out.println(student);
		
		System.out.println(student.hashCode());
		Student student2=context.getBean("student",Student.class);
		System.out.println(student2.hashCode());
		

	}

}
