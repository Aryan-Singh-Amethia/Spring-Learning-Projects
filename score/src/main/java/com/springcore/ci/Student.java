package com.springcore.ci;

import java.util.List;

public class Student {

	private int studentId;
	private String studentName;
	private String studentAddress;
	private List<String> hobbies;
	
	public Student() {
		//Important to make - gives error if not written
		super();
	}
	public Student(int studentId, String studentName, String studentAddress,List<String> hobbies) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.hobbies=hobbies;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", hobbies=" + hobbies + "]";
	}


	

}
