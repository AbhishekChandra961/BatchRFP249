package Array;
import java.util.Scanner;
public class OddPositionElementInArray {
	
	public static void oddElement(int a[]) {
		System.out.println("The elements on odd positions are : ");
		for(int i=0;i<a.length;i=i+2) {
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
		oddElement(array);
	}
}
