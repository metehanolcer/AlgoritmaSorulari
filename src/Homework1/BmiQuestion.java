package Homework1;

import java.util.Scanner;

public class BmiQuestion {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to BMI service, please enter height");
		
		float height = scanner.nextFloat();
		
		System.out.println("Welcome to BMI service, please enter weight");
		float weight = scanner.nextFloat();
		
		float bmi = (weight*10000)/(height*height);
		
		System.out.println("Your bmi value is" + " " + bmi);
		
		System.out.println("Then we'll determine your body type by using bmi, can you please enter your gender? You can write -1- for Male and -2- for Female");
		int gender = scanner.nextInt();
		if (gender==1) {
			
		if (bmi<20) {
				
				System.out.println("You are a man with a weak body type, you should gain weight under the control of a dietitian for your health.");
				
			}
			
		if (bmi>20 && bmi<25) {
			
			System.out.println("You are a man with a normal body type, we are glad that you are taking care of your own health.");
			
		}
		
		if (bmi>26 && bmi<30) {
		
	
			System.out.println("You are a man with a fat body type, you should lose weight under the control of a dietitian for your health.");
		
		}
		
		if (bmi>30) {
			
			System.out.println("You are a man with an obese body type, for your health, you should lose weight URGENTLY under the control of a dietitian.");
			
			
			
		}
			
		}
		
		if (gender==2) {
			
			if (bmi<19) {
				
				System.out.println("You are a woman with a weak body type, you should gain weight under the control of a dietitian for your health.");
				
			}
			
			if (19<bmi && bmi<24) {
			
			System.out.println("You are a woman with a normal body type, we are glad that you are taking care of your own health.");
			
		}
		
		if (25<bmi && bmi<30) {
		
	
			System.out.println("You are a woman with a fat body type, you should lose weight under the control of a dietitian for your health.");
		
		}
		
		if (30<bmi) {
			
			System.out.println("You are a woman with an obese body type, for your health, you should lose weight IMMEDIATELY under the control of a dietitian.");
			
		}
		
	}
		
		System.out.println("Thank you for taking a BMI calculation and taking care of your body!");
}
			
}
	


