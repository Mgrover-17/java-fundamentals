import java.util.Scanner;

class KilometersToMiles{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter distance in kms: ");
		double kilometers=sc.nextDouble();
		System.out.println("Miles : "+ kilometers*0.621371);
	}
}


