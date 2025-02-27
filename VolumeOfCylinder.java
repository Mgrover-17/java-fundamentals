import java.lang.Math;
import java.util.Scanner;

class VolumeOfCylinder{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius: ");
		int radius=sc.nextInt();
		System.out.print("Enter height: ");
		int height=sc.nextInt();
		System.out.println("Volume is: "+volume(radius,height));
	}
	public static double volume(int r,int h){
		return Math.PI * Math.pow(r,2) * h;
	}
}

		