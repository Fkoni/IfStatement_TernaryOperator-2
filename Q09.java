package _03_IfStatement_TernaryOperator;

public class Q09 {

    public static void main(String[] args) {

       /*   45 değerinde bir double oluşturun.
            Eğer double 5'e bölününce kalan 0 ise ve double 8'e bölününce kalan 0 ise
            "able to divide by 5 and 8" yazdırınız.

            Eğer double 10'a bölününce kalan 5 ise ve double 9'a bölününce kalan 0 ise
            "able to divide by 9 and divide by 10 reminder is 5" yazdırınız.
        */
    	System.out.println("*****Java seninle iyi anlasacagiz canim, hic naz etme*****");
    	double deger=45;
		
    	if ((deger%5 ==0) && (deger%8 ==0))   {
			System.out.println("able to divide by 5 and 8");
		
		} else if ((deger%10 ==5) && (deger%9 ==0))   {
			System.out.println("able to divide by 9 and divide by 10 reminder is 5");
		
		} else 
			System.out.println("En iyi kod calisan koddur");
		}	  
	   	
    	
    }

