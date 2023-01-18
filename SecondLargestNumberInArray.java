package Array;
import java.util.Scanner;
public class SecondLargestNumberInArray {
	public static int secondLargestNum(int[]a) {
		
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
		return a[a.length-2];
	}
	public static void main(String[] args) {
		int[]array=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 10 numbers of the array");
		for(int i=0;i<10;i++) {
			array[i]=sc.nextInt();
		}
		int n=secondLargestNum(array);
		System.out.println("Scond largest number in the array : "+n);
	}
}
