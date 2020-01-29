import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("First name: ");
		String first_name = scan.next();
		System.out.println("Last name: ");
		String last_name = scan.next();
		
		System.out.println("First_name: " + first_name + "\nLast_name: " + last_name );
		System.out.println("Full name: " + first_name + " " + last_name);
		
		scan.close();
		
	}

}
; 