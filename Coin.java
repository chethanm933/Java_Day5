package blday5prctc.java;
import java.util.Scanner;

public class Coin {
public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner flip = new Scanner(System.in);
	int read = flip.nextInt();
	
	double head = 0;
	double tail = 0;
		if(read <= 0) {
			System.out.println("invalid input");
		} else {
			for(int i=1; i<=read; i++) {
			double toss = Math.random();
			if(toss < 0.5) {
				tail++;
			} else {
			  head++;	
			
			}			
		}
			double tailper = ((tail*100)/read);
			double headper = ((head*100)/read);
	
			System.out.println("head :"+head+"\n tail :"+tail);
			
			System.out.println("tailpercetage :"+tailper+"\n head percentage :"+headper);		
		}
}

}
