package Array;
import java.util.Scanner;
public class AscendingOrderElementInArray {
	public static void ascendingOrder(int a[]) {
		int t=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("array in ascending order : ");
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+" ");
		}
		
	}
	public static void main(String[] args) {
		
		int[]array=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 10 elements of the array");
		for(int i=0;i<10;i++) {
			array[i]=sc.nextInt();
		}
		ascendingOrder(array);
	}
}
