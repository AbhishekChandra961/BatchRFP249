package Array;
import java.util.Scanner;
public class LargestNumberInArray {
	public int largestNum(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 10 numbers of the array");
		int[]array=new int[10];
		for(int i=0;i<10;i++) {
			array[i]=sc.nextInt();
		}
		LargestNumberInArray obj=new LargestNumberInArray();
		int m=obj.largestNum(array);
		System.out.println("Largest Number in the array is : "+m);
	}
}

