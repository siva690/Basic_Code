package hyrtutorials.telugu;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String name =  scanner.nextLine();
		
		System.out.printf("hey %s , How are you? \n",name);
		String status = scanner.nextLine();
		
		System.out.println("What is your age?");
		int age = scanner.nextInt();
		
		System.out.println("Thank you for the information");
		scanner.close();
	}

}
