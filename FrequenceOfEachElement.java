package Array;
import java.util.Scanner;
public class FrequenceOfEachElement {
	
	public static void findFrequence(int a[]) {
		byte count=1;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			System.out.println("Element "+a[i]+" repeats "+count+" times");
			count=0;
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 10 numbers of the array");
		int[]array=new int[10];
		for(int i=0;i<10;i++) {
			array[i]=sc.nextInt();
			
		}
		findFrequence(array);
		
	}
}
