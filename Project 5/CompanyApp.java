//
// Name: Lin, Alex
// Project: 5
// Due: 11/30/2023
// Course: cs-1400-02-f23
//
// Description:
// Project to use exceptions to validate data for employees at a company
// Test file, must use try and catch blocks when creating new objects, or errors will not be caught

public class CompanyApp {
	public static void main(String[] args) {
		System.out.println("My Company by A. Lin\n");

		try {
			Employee badDateEmployee = new Employee("James", "099-A", "11/90/2003");
			System.out.println(badDateEmployee);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		try {
			Employee badIdEmployee = new Employee("John", "10I-I", "11/30/2023");
			System.out.println(badIdEmployee);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		try {
			Employee goodEmployee = new Employee("Jack", "201-M", "11/13/2023");
			System.out.println(goodEmployee);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}

		try {
			ProductionWorker badDateProductionWorker = new ProductionWorker("Jerry", "089-A", "10/0/2003", 1, 20);
			System.out.println(badDateProductionWorker);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		try {
			ProductionWorker badIdProductionWorker = new ProductionWorker("Jenny", "089-Q", "10/12/2005", 2, 15);
			System.out.println(badIdProductionWorker);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		try {
			ProductionWorker goodProductionWorker = new ProductionWorker("Jerome", "080-L", "10/20/2013", 1, 18);
			System.out.println(goodProductionWorker);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}

		try {
			ShiftSupervisor badDateShiftSupervisor = new ShiftSupervisor("Jan", "701-J", "13/1/2023", 120000, 20000);
			System.out.println(badDateShiftSupervisor);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		try {
			ShiftSupervisor badIdShiftSupervisor = new ShiftSupervisor("Jorge", "9010-A", "12/1/2008", 100000, 5000);
			System.out.println(badIdShiftSupervisor);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		try {
			ShiftSupervisor goodShiftSupervisor = new ShiftSupervisor("Jill", "601-L", "12/25/2004", 150000, 10000);
			System.out.println(goodShiftSupervisor);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}

		try {
			TeamLeader badDateTeamLeader = new TeamLeader("Jordan", "888-M", "0/12/2005", 1, 30, 3000, 100, 20);
			System.out.println(badDateTeamLeader);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		try {
			TeamLeader badIdTeamLeader = new TeamLeader("Jackson", "000-9", "1/12/2006", 2, 40, 2000, 100, 55);
			System.out.println(badIdTeamLeader);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		try {
			TeamLeader goodTeamLeader = new TeamLeader("Jade", "909-F", "2/29/2004", 2, 50, 5000, 100, 60);
			System.out.println(goodTeamLeader);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}

	}
}
