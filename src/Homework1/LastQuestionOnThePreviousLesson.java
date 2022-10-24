package Homework1;

import java.util.Scanner;

public class LastQuestionOnThePreviousLesson {

	public static void main(String[] args) {

		//1- Sum
		//2- Extract
		//3- Multiply
		//4- Divide
		
		//Which operator do you want to use? Then choose it like 1,2,3 or 4
		
		//Enter 2 number for the operation that you have chosen
		
		// For example; if you choose 2 and you enter "4 and 5" then you will 4-5= -1
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Choose the operator from 1 to 4");
		
		System.out.println("1-Sum, 2-Extract, 3-Multiply, 4-Divide");
		
		int operator= scanner.nextInt();
		
		System.out.println("Enter two number");
		
		int x1= scanner.nextInt();
		int x2= scanner.nextInt();
		float result;
		
		if(operator==1) {
			
			result= x1+x2;
					
			System.out.println("Summation is" + " " + result);
		}
		
		if(operator==2) {
			
			result= x1-x2;
			
			float absolute=Math.abs(result);
					
			System.out.println("Extraction is" + " " + absolute + " " + "(as an absolute value)");
		}
		
		if(operator==3) {
			
			result= x1*x2;
					
			System.out.println("Multiplication is" + " " + result);
		}
		
		if(operator==4) {
			
			result= x1/x2;
					
			System.out.println("Division is" + " " + result);
			System.out.println("If your result is 0.0, the number that you have entered first is lower than the other");
		}
		
		System.out.println("Thank you for joining :)");
		
	}

}
