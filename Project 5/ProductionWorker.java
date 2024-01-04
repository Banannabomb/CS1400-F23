//
// Name: Lin, Alex
// Project: 5
// Due: 11/30/2023
// Course: cs-1400-02-f23
//
// Description:
// Project to use exceptions to validate data for employees at a company
// Production Worker file, extends employee and adds a shift field and a pay rate field

public class ProductionWorker extends Employee {
	private int shift;
	private double hourlyPayRate;

	public ProductionWorker(String name, String employeeNumber, String hireDate, int shift, double hourlyPayRate)
			throws IllegalArgumentException {
		super(name, employeeNumber, hireDate);
		this.shift = shift;
		this.hourlyPayRate = hourlyPayRate;
	}

	public ProductionWorker() {
		super();
		shift = 1;
		hourlyPayRate = 15;
	}

	public int getShift() {
		return shift;
	}

	public double getHourlyPayRate() {
		return hourlyPayRate;
	}

	public void setShift(int shift) {
		this.shift = shift;
	}

	public void setHourlyPayRate(double hourlyPayRate) {
		this.hourlyPayRate = hourlyPayRate;
	}

	public String toString() {
		return super.toString() + String.format(" Shift: %s PayRate:", shift, hourlyPayRate);
	}
}
