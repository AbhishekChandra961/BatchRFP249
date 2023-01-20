package day5Assignment;
import java.util.Scanner;
public class SwapTwoNumbers {
	
	public static void swapNum(int a,int b) {
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Value of A is : "+a);
		System.out.println("Value of B is : "+b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		int a=sc.nextInt();
		System.out.println("ENter the valur of b : ");
		int b=sc.nextInt();
		swapNum(a, b);
	}
}
