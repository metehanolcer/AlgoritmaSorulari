package Homework1;

import java.util.Scanner;

public class HomeworkQuestion1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Diğer gezegenlerde kaç kilo olduğunuzu merak ediyor musunuz?" + " " + "Öyleyse gelin başlayalım!" + " " + "İşlemlerde Dünya'daki yer çekimi 10 N olarak hesaplanmıştır :)");
		
		System.out.println("Kilonuzu giriniz");
		
		int x1 = scanner.nextInt();
		
		float saturn = x1*0.92f;
		float ay = x1*0.162f;
		float venus = x1*0.887f;
		float mars = x1*0.377f;
		float pluton = x1*0.006f;
		
		System.out.println("Saturn'deki kilonuz:" + " " + saturn);
		System.out.println("Ay'daki kilonuz:" + " " + ay);
		System.out.println("Venus'deki kilonuz:" + " " + venus);
		System.out.println("Mars'taki kilonuz:" + " " + mars);
		System.out.println("Pluton'daki kilonuz:" + " " + pluton + " " + "(Pluton gezegen mi emin değiliz :)");
		
		
	}

}
