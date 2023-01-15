package whileLoops;

public class armStrongNumber {
	public static void main(String[] args) {
		// armstrong number 153=(1*1*1)+(5*5*5)+(3*3*3)
		int n = 53;
		int temp = n;
		int d;
		int sum = 0;
		while (n > 0) {
			d = n % 10;
			sum = (d * d * d) + sum;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("number is armstrong");
		} else {
			System.out.println("number is not a armstrong");
		}
	}
}
