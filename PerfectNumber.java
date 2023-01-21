package day5Assignment;
import java.util.Scanner;
public class PerfectNumber {
	public static void perfectNum(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.println(n+" is a Perfect Number");
		}else {
			System.out.println(n+" is NOT a Perfect Number");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		perfectNum(num);
	}
}
