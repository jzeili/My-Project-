import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String username = "Leziel";
	int password = 1010;
	
	System.out.print("Enter Username: ");
	String typeUsername = scan.nextLine();

	if (typeUsername.equals(username)){
	System.out.print("Enter Password: ");
	int typePassword = scan.nextInt();
	
	switch(typePassword){
	case 1010:
	
	System.out.println("Enter the first number: ");
	double num1 = scan.nextDouble();
	
	System.out.println("Enter the second number: ");
	double num2 = scan.nextDouble();
	
	System.out.println("Select an operator");
	System.out.println("1. Addition");
	System.out.println("2. Multiplication");
	System.out.println("3. Subtraction");
	System.out.println("4. Division");
	System.out.println("Enter your choice 1-4: ");
	int choice = scan.nextInt();
	
	double result = 0;
	
	switch (choice) {
		case 1:
		       result = num1 + num2;
		       break;
		case 2:
		       result = num1 * num2;
		       break;
		case 3:
		       result = num1 - num2;
		       break;
		 case 4:
		        if (num2 != 0) {
		       result = num1 / num2;
		       
		        } else {
		        	System.out.println("Error: Division by zero:");
		        	return;
		        }
		        		break;
	default:
		        		System.out.println("Invalid number!");
		        		return;
		        	}
		        	
		        	System.out.println("The result is: " + result);
	}	        	
}		        			        	
}
}