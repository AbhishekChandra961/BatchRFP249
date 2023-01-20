package day5Assignment;
import java.util.Scanner;
public class QuotientRemainder {
	public static void calc(int a,int b) {
		
		int q=a/b;
		int r=a%b;
		System.out.println("Quotient is : "+q);
		System.out.println("Remainder is : "+r);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a=sc.nextInt();
		System.out.println("Enter the Second number : ");
		int b=sc.nextInt();
		calc(a, b);
	}
}
