
public class Manager extends Employee {
	
	private String department;
	
	public Manager() {
		
		super();
		department = " ";
		
	}
	
	public String getDepartment() {
		
		return department;
		
	}

	public void setDepartment(String dept) {
		
		department = dept;
	}
	
	public void EmployeeSummary() {
		
		super.EmployeeSummary();
		System.out.println("Department: " + department);
	}
	
}
