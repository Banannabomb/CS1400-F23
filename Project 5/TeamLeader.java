//
// Name: Lin, Alex
// Project: 5
// Due: 11/30/2023
// Course: cs-1400-02-f23
//
// Description:
// Project to use exceptions to validate data for employees at a company
// Team leader field, extends production worker and adds monthly bonus, required training hours, and attended training hours fields

public class TeamLeader extends ProductionWorker {
	private double monthlyBonus;
	private int requiredTrainingHours;
	private int attendedTrainingHours;

	public TeamLeader(String name, String employeeNumber, String hireDate, int shift, double hourlyPayRate,
			double monthlyBonus, int requiredTrainingHours, int attendedTrainingHours) {
		super(name, employeeNumber, hireDate, shift, hourlyPayRate);
		this.monthlyBonus = monthlyBonus;
		this.requiredTrainingHours = requiredTrainingHours;
		this.attendedTrainingHours = attendedTrainingHours;
	}

	public TeamLeader() {
		super();
		monthlyBonus = 0;
		requiredTrainingHours = 0;
		attendedTrainingHours = 0;
	}

	public double getMonthlyBonus() {
		return monthlyBonus;
	}

	public int getRequiredTrainingHours() {
		return requiredTrainingHours;
	}

	public int getAttendedTrainingHours() {
		return attendedTrainingHours;
	}

	public void setMonthlyBonus(double monthlyBonus) {
		this.monthlyBonus = monthlyBonus;
	}

	public void setRequiredTrainingHours(int requiredTrainingHours) {
		this.requiredTrainingHours = requiredTrainingHours;
	}

	public void setAttendedTrainingHours(int attendedTrainingHours) {
		this.attendedTrainingHours = attendedTrainingHours;
	}

	public String toString() {
		return super.toString()
				+ String.format(" Monthly Bonus: %s Required Training Hours: %s Attended Training Hours %s",
						monthlyBonus, requiredTrainingHours, attendedTrainingHours);
	}
}
