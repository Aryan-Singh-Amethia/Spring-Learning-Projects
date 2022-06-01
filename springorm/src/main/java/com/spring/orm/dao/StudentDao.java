package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
    

	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//Insert
	@Transactional
	public int insert(Student student) {
		Integer i = (Integer)this.hibernateTemplate.save(student);
		return i;
	}
	//read single row
	public Student read(int student_id) {
		Student student=this.hibernateTemplate.get(Student.class,student_id);
		return student;
	}
	//read multiple rows
	public List<Student> readAll(){
		List<Student> list = this.hibernateTemplate.loadAll(Student.class);
		return list;
	}
	//update
	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
	}
	//delete
	@Transactional
	public void deleteStudent(Student student) {
		this.hibernateTemplate.delete(student);
	}
}
