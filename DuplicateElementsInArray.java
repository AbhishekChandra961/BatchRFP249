package Array;
import java.util.Scanner;
public class DuplicateElementsInArray {
	
	public static void duplicateElement(int a[]) {
		int count;
		for(int i=0;i<a.length;i++) {
			count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count>1) {
				System.out.println("Element "+a[i]+" is duplicated "+count+" times.");
			}
		}
	}
	public static void main(String[] args) {
		int[]array=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 10 elements in the array");
		for(int i=0;i<10;i++) {
			array[i]=sc.nextInt();
		}
		duplicateElement(array);
	}
}
