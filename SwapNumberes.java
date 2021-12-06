package blday5prctc.java;

import java.util.Scanner;

public class SwapNumberes {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c;
	System.out.println("before swapping numbers: "+a +"  "+ b);  
    
	c = a;  
    a = b;  
    b = c;  
    System.out.println("After swapping: "+a +"   " + b);  
    System.out.println( );  
	}
}