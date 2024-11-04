import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("Enter first number: ");
	    int num1 = sc.nextInt();
		System.out.print("Enter second number: ");
	    int num2 = sc.nextInt();
	    
		if(num1>num2) {
		System.out.println("The first number is greater than second number");
		}else if(num1<num2) {
		    System.out.println("The second number is greater than first number");
		}else {
		    System.out.println("The second number and first number are equal");
		}
	}
}