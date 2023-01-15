package whileLoops;

public class prime {
	public static void main(String[] args) {

		int n = 8;
		int i = 1;
		int h = 0;
		while (i <= n) {
			if (n % i == 0) {
				h++;
			}
			i++;
		}
		if (h > 2) {
			System.out.println("Number is not a prime number");
		} else {
			System.out.println("Number is a prime number");
		}
	}
}
