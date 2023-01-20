package day5Assignment;
import java.util.Scanner;
public class AlphabetIsVowelOrConsonant {
	public static void vowelConsonant(String a) {
		a=a.toLowerCase();
		
		if(a=="a" || a=="e" || a=="i" || a=="o" || a=="u") {
			System.out.println("Vowel");
		}else {
			System.out.println("Consonant");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		String a=sc.next();
		vowelConsonant(a);
	}
}
