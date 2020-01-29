import java.util.Scanner;

public class addition {

	public static void main(String[] args) {

		Calc cal = new Calc();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter any two numbers: ");

		int a = scan.nextInt();
		int b = scan.nextInt();
		cal.add(a, b);

		System.out.println("Type continue to add another two numbers or else type exit to exit the program.");
		String input = scan.next();

		while (true) {

			if (input.equals("continue")) {

				System.out.println("Enter any two numbers: ");

				int c = scan.nextInt();
				int d = scan.nextInt();
				cal.add(c, d);
			} 
			else if (input.equals("exit")) {
				System.out.println("Program terminated.");
				break;
			} 
			else {
				System.out.println("Wrong input. Please type again.");
			}
			
			System.out.println("continue or exit?");
			input = scan.next();
		}

		scan.close();

	}
}

class Calc {

	void add(int c, int d) {
		System.out.println("Sum: " + (c + d));
	}
}