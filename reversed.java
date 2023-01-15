package whileLoops;

public class reversed {
	public static void main(String[] args) {

		int n = 123;
		int r;
		int rev = 0;
		while (n != 0) {
			r = n % 10;
			rev = (rev * 10) + r;
			n = n / 10;
		}
		System.out.println("Reverse of the number is : " + rev);

	}

}
