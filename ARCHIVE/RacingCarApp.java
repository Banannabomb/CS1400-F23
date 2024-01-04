//
// Name: Lin, Alex
// Project: 4
// Due: 10/31/2023
// Course: cs-1400-02-f23
//
// Description:
// A Racing app which utilizes the car class. Using 8 preset cars, the cars each randomly accelerate or brake over 30 iterations
// The program outputs all the cars speeds after iterations.

import java.util.Random;

public class RacingCarApp {
	public static void main(String[] args) {
		Random generator = new Random();
		Car car1 = new Car(1992, "Honda Civic");
		Car car2 = new Car(2005, "Toyota Corolla");
		Car car3 = new Car(2008, "Toyota Prius");
		Car car4 = new Car(2010, "Nissan Skyline");
		Car car5 = new Car(2013, "Dodge Challenger");
		Car car6 = new Car(1960, "Ford Mustang");
		Car car7 = new Car(1920, "Ford Model T");
		Car car8 = new Car(2020, "Tesla Model S");
		Car[] cars = { car1, car2, car3, car4, car5, car6, car7, car8 };
		int counter = 1;
		while (counter <= 30) {
			for (Car x : cars) {
				if (generator.nextInt(20) + 1 <= 18) {
					x.accelerate();
				} else {
					x.brake();
				}
			}
			counter++;
		}
		System.out.println("Racing Car by A. Lin\n");
		System.out.println("Model  Make                  Speed");
		System.out.println("-----  --------------------  -----");
		for (Car x : cars) {
			System.out.println(x.toString());
		}

	}
}
