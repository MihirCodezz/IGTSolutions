package com;

public class Employee {
	private int id;
	private String name;
	private int age;
	private int salary;
	private String desig;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	
	public void display()
	{
		System.out.println("ID :"+id);
		System.out.println("NAME  :"+name);
		System.out.println("AGE :"+age);
		System.out.println("SALARY :"+salary);
		System.out.println("DESIG :"+desig);
	}
	

}
