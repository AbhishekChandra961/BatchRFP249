package day5Assignment;
import java.util.Scanner;
public class EvenOdd {
	public static void evenOdd(int n) {
		if(n%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		evenOdd(n);
	}
}
