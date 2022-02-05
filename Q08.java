package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08 {
	
	/* Problem tanimi : 
	 * 
	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * 
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	 * alirsa %10 indirim yapin
	 */
		public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen aldiginiz urun adedini giriniz");
		double urunAdedi=scan.nextInt();
		
		System.out.println("Lutfen aldiginiz urun liste fiyatini giriniz");
		double urunListeFiyati=scan.nextInt();
		
		System.out.println("Lutfen musteri kartiniz var ise 1'i yoksa 2'yi tuslayiniz");
		int mKarti=scan.nextInt();
		
			 
	                
		if ((mKarti==1 && urunAdedi>10))   {
			System.out.println("Toplam Tutar  :" + (urunAdedi*urunListeFiyati*0.8)+ "TL %20 indirimli aldiniz");
		
		} else if ((mKarti==1 && urunAdedi<=10)){
			System.out.println("Toplam Tutar  :" + (urunAdedi*urunListeFiyati*0.85)+ "TL %15 indirimli aldiniz");
		
		} else if ((mKarti==2 && urunAdedi>10)){
			System.out.println("Toplam Tutar  :" + (urunAdedi*urunListeFiyati*0.85)+ "TL %15 indirimli aldiniz");
		
		} else  if ((mKarti==2 && urunAdedi<10)){
			System.out.println("Toplam Tutar  :" + (urunAdedi*urunListeFiyati*0.8)+ "TL %10 indirimli aldiniz");
		} else   {
			System.out.println("Musteri ömrumu yedin cik git");
		}	  
	   scan.close();
			}		
		
	
		}
		      
