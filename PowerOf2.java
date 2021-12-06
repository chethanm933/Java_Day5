package blday5prctc.java;

import java.util.Scanner;

	public class PowerOf2 {
		public static void main(String[] args) {
			
		double value;
		Scanner sc = new Scanner(System.in);
		value = sc.nextDouble();
		double a = 2;
		
	
		if(value >0 && value <=31) {
			for (double i = 1; i <= value ; i++) {
			double N = Math.pow(a, i);
			System.out.println("power of 2 :"+N);
			}
		} else {
			System.out.println("the number is not valid");
		}
	}
}
