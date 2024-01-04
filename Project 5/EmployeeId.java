//
// Name: Lin, Alex
// Project: 5
// Due: 11/30/2023
// Course: cs-1400-02-f23
//
// Description:
// Project to use exceptions to validate data for employees at a company
// EmployeeId file, validates that the given id follows the format ###-A

public class EmployeeId {
	private String employeeId;

	public EmployeeId(String employeedId) throws IllegalArgumentException {
		setEmployeeId(employeedId);
	}

	public void setEmployeeId(String employeedId) throws IllegalArgumentException {
		try {
			validId(employeedId);
			this.employeeId = employeedId;
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}

	private void validId(String employeeId) throws IllegalArgumentException {
		if (employeeId.length() != 5) {
			throw new IllegalArgumentException("Invalid employee Id, incorrect length" + employeeId.length());
		}
		if (((!Character.isDigit(employeeId.charAt(0))) ||
				(!Character.isDigit(employeeId.charAt(1))) ||
				(!Character.isDigit(employeeId.charAt(2))) ||
				(employeeId.charAt(3) != '-')) ||
				(!Character.isUpperCase(employeeId.charAt(4))) ||
				(employeeId.charAt(4) < 'A') ||
				(employeeId.charAt(4) > 'M')) {
			throw new IllegalArgumentException("Invalid employee Id, bad character");
		}

	}

	public String toString() {
		return employeeId;
	}
}
