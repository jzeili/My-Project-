import java.util.Scanner;
public class ArrayGrade {
    public static void main(String[] args) {
        String[] arrayName = {"John", "Alice", "Bob", "Eve"};
        int[] arrayScore = {85, 92, 76, 88};
        
        System.out.println("Student List:");
        for (int i = 0; i < arrayName.length; i++) {
            System.out.println(arrayName[i] + " - " + arrayScore[i]);
        }
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the student to update the score: ");
        String student = input.next();
        
        for (int i = 0; i < arrayName.length; i++) {
            if (student.equalsIgnoreCase(arrayName[i])) {
                System.out.print("Enter the new score for " + student + ": ");
                arrayScore[i] = input.nextInt();
                break;
            }
        }
        for (int i = 0; i < arrayName.length; i++) {
            System.out.println(arrayName[i] + " - " + arrayScore[i]);
        }
    }
    
}