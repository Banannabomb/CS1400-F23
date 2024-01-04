//
// Name: Lin, Alex
// Project: 4
// Due: 10/31/2023
// Course: cs-1400-02-f23
//
// Description:
// A car class which contains a make, year model, and speed. All attributes have a getter, and speed can be changed by 5 using
// brake or accelerate. Maximum speed of 180

public class Car {
	static final int maximumSpeed = 180;
	static int minimumSpeed = 0;
	private int yearModel, speed;
	private String make;

	public Car(int yearModel, String make) {
		this.yearModel = yearModel;
		this.speed = 0;
		this.make = make;
	}

	public int getYearModel() {
		return yearModel;
	}

	public int getSpeed() {
		return speed;
	}

	public String getMake() {
		return make;
	}

	public void accelerate() {
		if ((speed + 5) <= maximumSpeed) {
			speed += 5;
		}
	}

	public void brake() {
		if ((speed - 5) >= minimumSpeed) {
			speed -= 5;
		}
	}

	public String toString() {
		return String.format("%4d   %-20s    %3d", yearModel, make, speed);
	}

}
