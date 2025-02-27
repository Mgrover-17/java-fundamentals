import java.util.Scanner;

class AverageOfNumbers{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1=sc.nextInt();
		System.out.print("Enter second number: ");
		int num2=sc.nextInt();
		System.out.print("Enter third number: ");
		int num3=sc.nextInt();
		System.out.println("Average : "+ (num1+num2+num3)/3);
	}
}


