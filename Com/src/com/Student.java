package com;

public class Student {
	 int id;
	 
	 String name;
	 String course;
	 String email;
	 
	  Student()
	  {
	  }
	  public Student(int id, String name, String course, String email) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.email = email;
	}

	 
	 
	 public void display()
	 {
		  System.out.println("Stud info");
		  System.out.println(id+" "+name+" "+course+" "+email+" ");

	}

}
