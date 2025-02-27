import java.util.Scanner;

class CelsiusToFahrenheit{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter temperature in celsius: ");
		int Celsius=sc.nextInt();
		System.out.print("Temperature in fahrenheit is: "+(Celsius*9/5)+32);
	}
}


		
