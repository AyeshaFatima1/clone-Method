package com.objectCloning;

public class Employee implements Cloneable
{
 int id;
 String name;
 double salary;

 public Employee()
 {
	id=5679;
	name="Ayesha";
	salary=55678.90;
 }
 public void getinfo()
 {
	 System.out.println(id);
	 System.out.println(name);
	 System.out.println(salary);
 }
  public static void main(String[] args)throws CloneNotSupportedException
  {
	Employee employee=new Employee();
	employee.getinfo();
	System.out.println("============");
	Employee employee1=(Employee) employee.clone();
	employee1.getinfo();
}
}
