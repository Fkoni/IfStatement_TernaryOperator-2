package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 1 harf (karakter) aliniz ve 
		 * bunun buyuk harf, 
		 * kucuk harf yada 
		hatali giris seklinde kod yazniz
		 */
		 
		Scanner scan = new Scanner(System.in);
    	
		System.out.println("Lütfen bir karakter giriniz");
		char krk=scan.next().charAt(0);
		
		
		if ((krk>='A') && (krk<='Z')) {
			System.out.println("Girdiginiz :" + krk + " büyük bir harftir");
			
		} else  if ((krk>='a') && (krk<='z')) {  
			System.out.println("Girdiginiz :" + krk + " kücük bir harftir");
		}	else {
			System.out.println("Hatali giris, agam bizimle egleniy");			
	scan.close();
			}
	}
}
