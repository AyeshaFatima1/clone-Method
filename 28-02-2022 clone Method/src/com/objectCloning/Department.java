package com.objectCloning;

public class Department //implements Cloneable
{
 int deptid;
 String deptname;

 public Department()
 {
	deptid=78543;
	deptname="Development";
 }
 public void getinfo()
 {
	 System.out.println(deptid);
	 System.out.println(deptname);
 }
  public static void main(String[] args)//throws CloneNotSupportedException
  {
	Department deparment=new Department();
	deparment.getinfo();
	
	System.out.println("============");
	
	/*Department deparment2=(Department) deparment.clone();
	deparment2.getinfo();*/
	deparment.getinfo();
}
}
