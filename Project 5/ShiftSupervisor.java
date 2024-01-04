//
// Name: Lin, Alex
// Project: 5
// Due: 11/30/2023
// Course: cs-1400-02-f23
//
// Description:
// Project to use exceptions to validate data for employees at a company
// Shift Supervisor file, extends employee and adds annual salary and production bonus field

public class ShiftSupervisor extends Employee {
	private double annualSalary;
	private double productionBonus;

	public ShiftSupervisor(String name, String employeeNumber, String hireDate, double annualSalary,
			double productionBonus) {
		super(name, employeeNumber, hireDate);
		this.annualSalary = annualSalary;
		this.productionBonus = productionBonus;
	}

	public ShiftSupervisor() {
		super();
		annualSalary = 0;
		productionBonus = 0;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public double getProductionBonus() {
		return productionBonus;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public void setProductionBonus(double productionBonus) {
		this.productionBonus = productionBonus;
	}

	public String toString() {
		return super.toString()
				+ String.format(" Annual Salary: %s Production Bonus: %s", annualSalary, productionBonus);
	}
}
