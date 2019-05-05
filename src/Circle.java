import java.util.Scanner;

public class Circle {
	private final double radius;

	public static void main(String[] args) {
//		 private final double radius;

		try (Scanner sc = new Scanner(System.in)) {
			double radius = sc.nextDouble();
			Circle circle = new Circle(radius);

			System.out.println("Circumference: ");
			System.out.println(circle.getCircumference());
			System.out.println("Area: ");
			System.out.println(circle.getArea());
		}

	}

	public Circle(double radius) {
		if (radius < 0) {
			throw new IllegalArgumentException();
		}
		this.radius = radius;
	}

	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	private static String formatNumber(double x) {
		return "";
	}
	
	public String getFormattedCircumference() {
		return "";
	}
	
	public String getFormattedArea() {
		return "";
	}

}
