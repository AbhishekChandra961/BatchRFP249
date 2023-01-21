package day5Assignment;
import java.util.Scanner;
import java.util.Random;
public class CouponNumber {
	public static void randomCouponNum(int n) {
		
		int r;
		Random random=new Random();
		int count=1;
		do {
			r=random.nextInt(100)+1;
			System.out.println("Random number is "+r);
			if(r==n) {
				System.out.println(count+" random numbers is needed to generate your coupon number");
				break;
			}else {
				count++;
			}
		}while(n>0);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Coupon Number Between 1 to 100 :");
		int num=sc.nextInt();
		randomCouponNum(num);
	}
}
