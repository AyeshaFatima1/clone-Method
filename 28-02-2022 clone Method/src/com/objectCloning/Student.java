package com.objectCloning;

//To Do Cloning we have to follow these steps

//step1: class should implements 'Cloneable' interface 
public class Student implements Cloneable
{
 //variables
 int id;
 String name;
 int marks;
 String address;

 //constructor
 public Student()
 {
	id=5679;
	name="Ayesha";
	marks=87;
	address="Hyderabad";
 }
 public void getinfo()
 {
	 System.out.println(id);
	 System.out.println(name);
	 System.out.println(marks);
	 System.out.println(address);
 }
//step2: should declare CloneNotSupportedException exception class
  public static void main(String[] args)throws CloneNotSupportedException
  {
//step3: create at least one object with new keyword and constructor 
	System.out.println("=========using new keyword=========");
			
	Student student1=new Student();
	student1.getinfo();

	System.out.println("=========using clone() method=========");
	
	/**
	 * step4: by using existing object reference we have to call
	 * clone() method and type cast it. 
	 */
		
	Student student2=(Student) student1.clone();
	student2.getinfo();
}
}
