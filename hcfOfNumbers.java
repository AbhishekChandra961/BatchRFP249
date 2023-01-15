package forLoops;

public class hcfOfNumbers {
	public static void main(String[] args) {

		int n1 = 16;
		int n2 = 8;
		int hcf = 0;
		for (int i = 1; i <= n1 || i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				hcf = i;
			}
		}
		System.out.println("HCF of " + n1 + " and " + n2 + " is " + hcf);
	}
}
