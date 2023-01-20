package day5Assignment;
import java.util.Scanner;
public class LeapYear {
	public static void leap(int y) {
		if(y%4==0) {
			System.out.println("Leap Year");
		}else {
			System.out.println("Not Leap Year");
		}
	}
	public static void main(String[] args) {
		int yr;
		System.out.println("Enter the Year : ");
		do {
		Scanner sc=new Scanner(System.in);
		yr=sc.nextInt();
		if(yr>999) {
			break;
		}
		else {
			System.out.println("INVALID : Enter 4 digit number");
		}
		}while(yr>0);
		leap(yr);
	}
}
