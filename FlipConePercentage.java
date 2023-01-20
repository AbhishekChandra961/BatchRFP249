 package day5Assignment;
import java.util.Scanner;
public class FlipConePercentage {
	public static void flipCone(int l) {
		
		byte head=1,tail=1;
		double[]ar=new double[10];
		double r;
		for(int i=0;i<l;i++) {
			 r = Math.random();
			 ar[i]=r;
		}
		//for(int k=0;k<l;k++) {
		//System.out.println(ar[k]);
		//}
		for(int j=0;j<ar.length;j++) {
			if(ar[j]>0.5) {
				head++;
			}
			else if(ar[j]<0.5) {
				tail++;
			}
		}
		System.out.println(head);
		System.out.println(tail);
		double headPercent=(double)head/l*100;
		double tailPercent=(double)tail/l*100;
		System.out.println(headPercent+"% Heads");
		System.out.println(tailPercent+"% Tails");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of times coin should be fliped : ");
		int t=sc.nextInt();
		flipCone(t);
	}
}
