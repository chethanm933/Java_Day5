package blday5prctc.java;


import java.util.Iterator;
import java.util.Scanner;

public class FlipCoin {
	static int head;
	static int tail;
		public static void main(String[] args) {
		System.out.println("enter a value how many times you want to flip the coin?"); 
		Scanner fliptime = new Scanner(System.in);
		int cont = fliptime.nextInt();
		fliptime.close();
		
		if(cont<=0) {
		System.out.println("the number is invalid");	
		} else {
			System.out.println("the number is valid");
			FlipCoin flipcoin = new FlipCoin();
			flipcoin.flipCoin(cont);
			System.out.println("the head is :" +head+ "\n the tail is :"+tail);
			double headper = ((head*100)/cont);
			double tailper = (tail*100/cont);
			System.out.println("head percetage is :"+headper+"\ntail percentage is :"+tailper);
		}
}
			public void flipCoin(int cont) {
				 head = 0;
				 tail = 0;
			for (int i = 1; i <= cont; i++) {
				double result = Math.random();
				if(result <0.5) {
					tail++;
				} else {
                   head++;
				} 
			
			}				
		}
}

