package forLoops;

public class fibonacci {
	public static void main(String[] args) {
	//fibonacci 0 1 1 2 3 5 8 13 24 37
		int n=20;
		System.out.print("0 ");
		System.out.print("1 ");
		int n1=0;
		int n2=1;
		int n3;
		for(int i=3;i<=n;i++) {
			
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
			
		}
	}
}
