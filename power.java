package whileLoops;

public class power {
	public static void main(String[] args) {

		int n1 = 6;
		int n2 = 8;
		int p = 1;
		int i = 1;
		while (i <= n2) {
			p = p * n1;
			i++;
		}
		System.out.println("Power is : " + p);
	}
}
