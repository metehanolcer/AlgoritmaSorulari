package Homework1;

import java.util.Scanner;

public class HomeworkQuestion1v1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Diğer gezegenlerde kaç kilo olduğunuzu merak ediyor musunuz?" + " " + "Öyleyse gelin başlayalım!" + " " + "İşlemlerde Dünya'daki yer çekimi 10 N olarak hesaplanmıştır :)");
		
		System.out.println("Kilonuzu giriniz");
		
		int x1 = scanner.nextInt();

		System.out.println("Sıra gezegen seçimine geldi!" + "1'den 4'e kadar olan numaraların hepsi bir gezegeni temsil ediyor");
		System.out.println("1-Saturn, 2-Ay, 3-Venus, 4-Mars" + " " + "Seçimini yap bakalım :)");
		
		int gezegen = scanner.nextInt();
		
		float saturn = x1*0.92f;
		float ay = x1*0.162f;
		float venus = x1*0.887f;
		float mars = x1*0.377f;
		
		if (gezegen==1) {
			
			System.out.println("Saturn'deki kilonuz" + " " + saturn);
		}
		
		if (gezegen==2) {
			
			System.out.println("Ay'daki kilonuz" + " " + ay);
			
		}
			
		if (gezegen==3) {
				
				System.out.println("Venus'deki kilonuz" + " " + venus);
				
		}
				
		if (gezegen==4) {
					
					System.out.println("Mars'taki kilonuz" + " " + mars);
					
		
				}
		System.out.println("Katılımınız için teşekkürler :)");
			}
	  
	}


