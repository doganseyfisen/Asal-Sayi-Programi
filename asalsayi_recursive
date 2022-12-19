import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static boolean asalSayi(int num) {
		
		for(int i = 2; i < num; i++) {
			
			if(num % i == 0) {
				return false;
			}
			
		  }
		  return true;
	  }
	
    public static void main(String[] args){
    	Scanner inp = new Scanner(System.in);
    	System.out.print("Sayı girin= ");
    	int numInp = inp.nextInt();
    	
    	System.out.print(numInp + " Sayısına Kadar Mevcut Asal Sayılar: ");
    	
    	for(int j = 2; j <= numInp; j++) {
    		
    		if(asalSayi(j)) {
    			System.out.print(j + " ");
      }
    }
    
  }
}
