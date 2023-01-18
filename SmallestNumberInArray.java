package Array;
import java.util.Scanner;
public class SmallestNumberInArray {
	
	public int smallestNum(int a[]) {
	int min=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]<min) {
			min=a[i];
		}
	}
	return min;
}
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 10 numbers of the array");
	int[]array=new int[10];
	for(int i=0;i<10;i++) {
		array[i]=sc.nextInt();
	}
	SmallestNumberInArray obj=new SmallestNumberInArray();
	int m=obj.smallestNum(array);
	System.out.println("smallest Number in the array is : "+m);
}
}
