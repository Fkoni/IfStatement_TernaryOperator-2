package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //// Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.

    	Scanner scan = new Scanner(System.in);
    	
		System.out.println("L�tfen bulundugunuz enlem bilgisini giriniz");
		double enlem= scan.nextInt();
		
		System.out.println("L�tfen bulundugunuz boylam bilgisini giriniz");
		double boylam= scan.nextInt();
		
		if ((enlem>=36 && enlem<=42) && (boylam >=26 && boylam<=45))  {
			System.out.println("Turkiye sinirlari icindesin canim");
			
		} else  {
			System.out.println("Turkiye sinirlari disindasin yuvana don");
								
	scan.close();
       
    }
    }
}
