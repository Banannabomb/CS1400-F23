//
// Name: Lin, Alex
// Project: 5
// Due: 11/30/2023
// Course: cs-1400-02-f23
//
// Description:
// Project to use exceptions to validate data for employees at a company
// Employee file, has a name, employee number, and hire date field, along with apropriate setters and getters

public class Employee {
	private String name;
	private EmployeeId employeeNumber;
	private Date hireDate;

	public Employee(String name, String employeeNumber, String hireDate) throws IllegalArgumentException {
		this.name = name;
		this.employeeNumber = new EmployeeId(employeeNumber);
		this.hireDate = new Date(hireDate);
	}

	public Employee() {
		name = "";
		setEmployeeNumber("");
		setHireDate("name");
	}

	public String getName() {
		return name;
	}

	public String getHireDate() {
		return hireDate.toString();
	}

	public String getEmployeeNumber() {
		return employeeNumber.toString();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHireDate(String hireDate) throws IllegalArgumentException {
		this.hireDate = null;
		this.hireDate = new Date(hireDate);
	}

	public void setEmployeeNumber(String employeeNumber) throws IllegalArgumentException {
		this.employeeNumber = null;
		this.employeeNumber = new EmployeeId(employeeNumber);
	}

	public String toString() {
		return String.format("Name: %s Id: %s Hire Date: %s", name, employeeNumber, hireDate);
	}
}
