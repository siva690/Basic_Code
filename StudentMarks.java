package hyrtutorials.telugu;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter student marks");		
		int marks = sc.nextInt();

		if(marks<35)
			System.out.println("Student is failed");

		else if(marks==35)
			System.out.println("Student is just passed");

		else if(marks>35 && marks<75)
			System.out.println("Student secured third class");

		else if(marks>=70 && marks<85)
			System.out.println("Student securd second class");

		else
			System.out.println("Student secured first class");

		sc.close();
	}

}
