package com.jwt.sc.model;

public class Student {

	private String name;
	private Integer rollno;
	private String phno;

	public Student(String name, Integer rollno, String phno) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.phno = phno;
	}


	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Integer getRollno() {
		return rollno;
	}




	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}




	public String getPhno() {
		return phno;
	}




	public void setPhno(String phno) {
		this.phno = phno;
	}




	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", phno=" + phno + "]";
	}



}
