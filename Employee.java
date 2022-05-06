
public class Employee { // Employee class attributes

	private String firstName;
	private String lastName;
	private int employeeID;
	private double salary;
	
	
	public Employee() { // Default constructor
		
		firstName = " ";
		lastName = " ";
		employeeID = 0;
		salary = 0;
		
		
	}
	
	public String getFirstName() {
		
		
		return firstName;
	}
	
	public void setFirstName(String fName) {
		
		firstName = fName;
		
	}
	
	public String getLastName() {
		
		return lastName;
		
	}
	
	public void setLastName(String lName) {
		
		lastName = lName;
	}
	
	public double getEmployeeID() {
		
		return employeeID;
	}
	
	public void setEmployeeID(int eID) {
		
		employeeID = eID;
		
	}
	
	public double getSalary() {
		
		return salary;
	}
	
	public void setSalary(int sal) {
		
		salary = sal;
	}
	
	public void EmployeeSummary() {
		
		System.out.println("Employee Name: " + firstName + " " + lastName);
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Employee salary: " + salary);
		
	}
	
}
