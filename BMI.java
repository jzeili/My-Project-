import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		double weight = 40;
		double height = 1.50;
		double BMI = weight/ (height*height);
		System.out.println("BMI"+ BMI);
		
		if (BMI < 18.5) {
			System.out.println("Underweight");
			
	}else if ( BMI >= 18.5 && BMI <25.0){
			System.out.println("Normal");
			
	}else if (BMI >=25.0 && BMI < 30.0){
			System.out.println("Overweight");
			
	}else if (BMI >= 30.0){
			System.out.println("Obese");
					
	}
	}
}