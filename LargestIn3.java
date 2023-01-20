package day5Assignment;
import java.util.Scanner;
public class LargestIn3 {
	public static void large(int a,int b,int c) {
		int[]ar= {a,b,c};
		int t=0;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					t=ar[i];
					ar[i]=ar[j];
					ar[j]=t;
				}
			}
		}
		System.out.println("2 large number is : ");
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
	}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 3 numbers : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		large(x,y,z);
		
	}
}
