package Array;
import java.util.Scanner;
public class ReverseOrderElement {
	public static void reverseNum(int a[]) {
		System.out.println("Elements of the array in reverse order are : ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		int[]array=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 10 numbers in the array");
		for(int i=0;i<10;i++) {
			array[i]=sc.nextInt();
		}
		reverseNum(array);
	}
}
