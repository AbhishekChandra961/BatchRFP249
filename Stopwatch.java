package day5Assignment;
import java.util.Scanner;
public class Stopwatch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Start");
		double startTimer=System.currentTimeMillis();
		
		System.err.println("End");
		byte endClick=sc.nextByte();
		double endTimer=System.currentTimeMillis();
		
		double timeTaken=(endTimer-startTimer)/1000;
		
		System.out.println(": Time Take :: "+timeTaken);
	}
}
