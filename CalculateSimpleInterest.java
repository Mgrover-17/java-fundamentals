import java.util.Scanner;

class CalculateSimpleInterest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter principal: ");
		int Principal=sc.nextInt();
		System.out.print("Enter rate: ");
		int Rate=sc.nextInt();
		System.out.print("Enter time: ");
		int Time=sc.nextInt();
		System.out.println("Simple Interest : "+ (Principal*Rate*Time)/100);
	}
}
