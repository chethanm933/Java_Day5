package blday5prctc.java;

import java.util.Scanner;

public class Harmonic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextInt();
		double sum = 0;
		
		for (double i = 1; i <= n; i++) {
			double hm = 1/i;
			sum = hm + sum;
			System.out.println(sum);
		}
		
	}
}	
	


