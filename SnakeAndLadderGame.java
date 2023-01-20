package day4PracticeProblem;
import java.util.Scanner;
import java.util.Random;
public class SnakeAndLadderGame {
	
	public static int snake(int pos,String p) {
		int pos1=pos;
		switch(pos) {
		case 99:
				pos1=14;
				System.out.println("OOps snake bite to "+p+" :99 to 14");
				break;
		case 92:
				pos1=54;
				System.out.println("OOps snake bite to "+p+":92 to 54");
				break;
		case 85:
				pos1=47;
				System.out.println("OOps snake bite to "+p+" :85 to 47");
				break;
		case 78:
				pos1=40;
				System.out.println("OOps snake bite to "+p+" :78 to 40");
				break;
		case 55:
				pos1=25;
				System.out.println("OOps snake bite to "+p+" :55 to 25");
				break;
		case 49:
				pos1=10;
				System.out.println("OOps snake bite to "+p+" :49 to 10");
				break;
		default:
				break;
		}
		return pos1;
	}
	public static int ladder(int pos,String p) {
		int pos1=pos;
		switch(pos) {
		case 3:
			pos1=22;
			System.out.println("Hurry ladder up to "+p+" :3 to 22");
			break;
		case 11:
			pos1=69;
			System.out.println("Hurry ladder up to "+p+" :11 to 69");
			break;
		case 21:
			pos1=61;
			System.out.println("Hurry ladder up to "+p+" :21 to 61");
			break;
		case 34:
			pos1=53;
			System.out.println("Hurry ladder up to "+p+" :34 to 53");
			break;
		case 39:
			pos1=58;
			System.out.println("Hurry ladder up to "+p+" :39 to 58");
			break;
		case 74:
			pos1=86;
			System.out.println("Hurry ladder up to "+p+" :74 to 86");
			break;
		default:
			break;
		}
		return pos1;
		
	}
	public static void main(String[] args) {
		int r=1;
		int d1,d2;
		int position1=0;
		int position2=0;
		Random random=new Random();
		Scanner sc=new Scanner(System.in);
		SnakeAndLadderGame obj=new SnakeAndLadderGame();
		System.out.println("Enter first player1 name :");
		String p1=sc.nextLine();
		System.out.println("Entre Second player2 name :");
		String p2=sc.nextLine();
		while(r==1 || position1==100 || position2==100){
			
			d1=random.nextInt(6)+1;
			d2=random.nextInt(6)+1;
			position1=position1+d1;
			position2=position2+d2;
			position1=obj.snake(position1,p1);
			position1=obj.ladder(position1,p1);
			position2=obj.snake(position2,p2);
			position2=obj.ladder(position2,p2);
			System.out.println(p1+" dice rolled to : "+d1);
			System.out.println(p2+" dice rolled to : "+d2);
			System.out.println(p1+"'s position is "+position1);
			System.out.println(p2+"'s position is "+position2);
			System.out.println("Enter 1 to roll dice Or 0 to terminate the game ");
			r=sc.nextInt();
			if(position1==100) {
				System.out.println("Congrats....Player1 won");
				break;
			}else if(position2==100) {
				System.out.println("Congrats....Player2 won");
				break;
			}else if(position1>100) {
				position1=position1-d1;
			}else if(position2>100) {
				position2=position2-d2;
			}
		}
	}
}
