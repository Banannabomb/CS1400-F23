
public class CircleArea {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double radius;

		System.out.println("Enter the radius?");
		radius = keyboard.nextDouble();

		double area;
		area = Math.PI * radius * radius;
		System.out.println("Area of a circle with radius " + radius + " is " + area + ".");
	}
}