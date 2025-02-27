import java.lang.Math;
import java.util.Scanner;

class AreaOfCircle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius: ");
		int radius=sc.nextInt();
		System.out.print("Area of circle is : "+Area(radius));
	}
	public static double Area(int r){
		return Math.PI*Math.pow(r,2);
	}
}

		