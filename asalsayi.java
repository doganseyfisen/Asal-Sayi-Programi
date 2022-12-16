import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		int i;
		
		for(i = 2; i <= 100; i++){
            boolean prime = true;
            
            
            for(int j = 2; j < i; j++){
                if (i % j == 0){
                    prime = false;
                }
            }
            if(prime) {
                System.out.print(i + " ");
            }
		}
	}
}
