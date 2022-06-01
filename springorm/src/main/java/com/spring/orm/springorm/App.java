package com.spring.orm.springorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program begins..." );
        ApplicationContext context=new ClassPathXmlApplicationContext("file:C:\\Users\\Aryan Singh Amethia\\eclipse-workspace\\springorm\\src\\main\\java\\config.xml");
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
//        int r=student.insert(new Student(111,"Asif","BBSR"));
//        System.out.println(r);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to my console CRUD app.");
        boolean keepGoing=true;
        int choice=-1;
        while(keepGoing) {
        	System.out.println("1 for Insert");
        	System.out.println("2 for Reading single student");
        	System.out.println("3 for Reading all students data.");
        	System.out.println("4 for Update");
        	System.out.println("5 for Delete");
        	System.out.println("6 to Exit");
        	try {
        		choice = Integer.parseInt(br.readLine());
        		switch(choice) {
        		 case 1:
        			 int student_id =Integer.parseInt( br.readLine());
        			 String student_name=br.readLine();
        			 String student_city=br.readLine();
        			 Student newStudent = new Student(student_id,student_name,student_city);
        			 studentDao.insert(newStudent);
        			 System.out.println("1 Row inserted");
        			 break;
        		 case 2:
        			 int student_id1 = Integer.parseInt(br.readLine());
        			 Student s=studentDao.read(student_id1);
        			 System.out.println(s);
        			 break;
        		 case 3:
        			 List<Student> list = studentDao.readAll();
        			 for(Student stu: list)
        				 System.out.println(stu);
        			 break;
        		 case 4:
        			 studentDao.updateStudent(new Student());
                     System.out.println("row updated");
        			 break;
        		 case 5:
        			 break;
        	     		 
        		 case 6 :
        			 keepGoing=false;
        			 break;		
        	     default: continue;		 
        			 
        		}
        	}catch(IOException ex) {
        		System.out.println(ex.getStackTrace());
        	}catch(Exception e) {
        		System.out.println(e.getStackTrace());
        	}
        }
        System.out.print("Program Terminated");
    }
}
