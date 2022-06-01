package com.spring.jdbc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring JDBC program begins" );
        ApplicationContext context = new ClassPathXmlApplicationContext("file:C:\\Users\\Aryan Singh Amethia\\eclipse-workspace\\springjdbc\\src\\main\\java\\com\\spring\\jdbc\\config.xml");
        /*Insertion*/
      //  JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
        
      //  String query="insert into student(id,name,city) values(?,?,?)";
        
      //  fire query
      //  int result = template.update(query,103,"Anubhav","Kolkata");
      //  System.out.println("Number of rows Inserted is "+result);
        StudentDao studentDao= context.getBean("studentDao",StudentDao.class);
       
//        Student student = new Student(104,"Helen","Nigeria");
//        
//        int result = studentDao.insert(student);
//        System.out.println(result + " rows inserted.");
        /*Updation*/
//        Student student = new Student(104,"Helen Asimanava","South Africa");
//        int r = studentDao.change(student);
//        System.out.println(r + " rows updated");
//        
       /*Deletion*/
//        int res= studentDao.delete(104);
//        System.out.println(res + " rows deleted");
        
        /*Selection*/
//        Student student = studentDao.getStudent(102);
//        System.out.println(student);
        
        /*All students selection*/
        
        List<Student> studList=new ArrayList<Student>();
        studList=studentDao.getAllStudents();
        for(Student s : studList)
        	System.out.println(s);
        
    }
}
