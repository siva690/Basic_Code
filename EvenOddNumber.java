package hyrtutorials.telugu;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the value");

		int number=sc.nextInt();
		if(number%2==0) {
			System.out.println("Given number is Even:"+number);
		}else {
			System.out.println("Given number is Odd:"+number);

			sc.close();
		}

	}

}
