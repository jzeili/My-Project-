import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		char input;
		
		System.out.println("Enter a character: ");
		input=sc.next().charAt(0);
		
		if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z')) {
			System.out.println("display "+ input + " is a letter");
	}else if ((input >= '0' && input <='9')){	 
			System.out.println("display "+ input + " is a digit");
		
		}else {
			System.out.println("display " + input + " is not a letter or a digit");
}			
	}
}