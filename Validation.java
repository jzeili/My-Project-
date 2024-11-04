

import java.util.Scanner;
public class Validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Username;
        System.out.println("Enter username: ");
        Username = sc.nextLine();

        char Sex;
        System.out.println("Enter sex: ");
        Sex = sc.next().charAt(0);

        int Age;
        System.out.println("Enter age: ");
        Age = sc.nextInt();

        float Height;
        System.out.println("Enter height: ");
        Height = sc.nextFloat();

        float Weight;
        System.out.println("Enter weight: ");
        Weight = sc.nextFloat();

        System.out.println("Username: " + Username);
        System.out.println("Sex: " + Sex);
        System.out.println("Age: " + Age);
        System.out.println("Height: " + Height);
        System.out.println("Weight: " + Weight);

    }

}