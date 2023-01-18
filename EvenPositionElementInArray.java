package Array;
import java.util.Scanner;
public class EvenPositionElementInArray {
	
	public static void evenElement(int a[]) {
		System.out.println("The elements on even positions are : ");
		for(int i=1;i<a.length;i=i+2) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array with 10 elements :");
		int[]array=new int[10];
		for(int i=0;i<10;i++) {
			array[i]=sc.nextInt();
		}
		evenElement(array);
	}
}
