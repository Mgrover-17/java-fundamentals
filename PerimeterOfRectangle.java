import java.util.Scanner;

class PerimeterOfRectangle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length: ");
		int length=sc.nextInt();
		System.out.print("Enter width: ");
		int width=sc.nextInt();
		System.out.println("Perimeter of Rectangle : "+ 2 *(length+width));
	}
}

