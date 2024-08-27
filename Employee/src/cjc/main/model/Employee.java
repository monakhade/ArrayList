package cjc.main.model;

public class Employee 
{
	private int eid;
	private String ename;
	private long contact;
	private double salary;
	private String department;
	private int age;
	public Employee(int eid, String ename, long contact, double salary, String department, int age) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.contact = contact;
		this.salary = salary;
		this.department = department;
		this.age = age;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
