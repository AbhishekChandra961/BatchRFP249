package day5Assignment;
import java.util.Scanner;
public class HarmonicNumber {
	public static void harmonicNum(int n) {
		float sum=0;
		for(int i=1;i<=n;i++) {
			sum=(float)1/i+sum;
		}
		System.out.println("The "+n+"th Harmonic Number is : "+sum);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		harmonicNum(n);
		
	}
}
