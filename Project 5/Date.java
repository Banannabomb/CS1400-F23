//
// Name: Lin, Alex
// Project: 5
// Due: 11/30/2023
// Course: cs-1400-02-f23
//
// Description:
// Project to use exceptions to validate data for employees at a company
// Date file, validates that the given string is a valid calendar date

public class Date {
	private String date;

	public Date(String date) throws IllegalArgumentException {
		setDate(date);
	}

	public void setDate(String date) throws IllegalArgumentException {
		try {
			validDate(date);
			this.date = date;
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}

	private void validDate(String date) throws IllegalArgumentException {
		String[] dateArray = date.split("/");
		if (dateArray.length != 3) {
			throw new IllegalArgumentException("Invalid date, should be formatted as 'MM/DD/YYYY'");
		}
		for (String x : dateArray) {
			try {
				Integer.parseInt(x);
			} catch (NumberFormatException e) {
				throw new IllegalArgumentException("Invalid date, should only contain digits and /");
			}
		}

		int month = Integer.parseInt(dateArray[0]);
		int day = Integer.parseInt(dateArray[1]);
		int year = Integer.parseInt(dateArray[2]);

		if (month > 12 || month < 1) {
			throw new IllegalArgumentException("Invalid date, month should be an integer from 1 to 12");
		}
		if (year < 0) {
			throw new IllegalArgumentException("Invalid date, year cannot be negative");
		}

		int maxDay = getNumberOfDaysInMonth(month, year);

		if (day > maxDay || day < 1) {
			throw new IllegalArgumentException(
					"Invalid date, day is either below 1 or above the number of days in a month");
		}

	}

	private boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	};

	private int getNumberOfDaysInMonth(int month, int year) {
		return switch (month) {
			case 4, 6, 9, 11 -> 30;
			case 2 -> isLeapYear(year) ? 29 : 28;
			default -> 31;
		};
	}

	public String toString() {
		return date;
	}
}
