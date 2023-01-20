package day5Assignment;
import java.util.Scanner;
public class PrimeFactor {
	public static void primeFactor(int n) {
		int c=2;
		while(n>1) {
			if(n%c==0) {
				System.out.print(c+" ");
				n=n/c;
			}
			else {
				c++;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The number : ");
		int n=sc.nextInt();
		primeFactor(n);
		
	}
}
