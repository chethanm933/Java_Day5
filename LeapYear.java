package blday5prctc.java;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("enter an year");
	Scanner leapyear = new Scanner(System.in);
	int year =leapyear.nextInt();
	leapyear.close();
	
		if(year >= 1000 && year <= 9999) {
			System.out.println("valid input");
				if((year % 4 == 0 && year % 100 != 0)|| (year % 400 == 0)) {
				System.out.println("the year is leapyear :");	
				} else {
					System.out.println("the year is not a leapyear");
				}
			
		} else {
			System.out.println("invalid");
		}
}

}
