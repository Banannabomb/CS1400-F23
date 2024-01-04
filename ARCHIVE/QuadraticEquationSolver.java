//
// Name: Alexander Lin
// Project: 1
// Due date: 2023-09-19
// Course: cs-1400-02-F23
//
// Description:
//	 A program that solves the quadratic equation given the coefficients a, b, and c of a quadratic
//

import java.util.Scanner;

public class QuadraticEquationSolver{
	public static void main(String[] args){
		double a, b, c, discriminant, x1, x2;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Quadratic Equation Solver by A. Lin\n");

		System.out.print("Enter a? ");
		a = keyboard.nextDouble();

		System.out.print("Enter b? ");
		b = keyboard.nextDouble();

		System.out.print("Enter c? ");
		c = keyboard.nextDouble();
		
		discriminant = b*b - 4*a*c;

		x1 = (-b + Math.sqrt(discriminant))/(2*a);
		x2 = (-b - Math.sqrt(discriminant))/(2*a);

		System.out.println("\nThe solutions:");
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);

	}
}