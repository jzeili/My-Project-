import java.util.Scanner;
public class SlotMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] symbols = {"Apple", "Banana", "Cherry", "Dragonfruit"};
        System.out.println("Welcome to the Slot Machine!");
        System.out.print("Enter your starting balance: ");
        int credits = scanner.nextInt();

        if (credits <= 0) {
            System.out.println("Invalid balance. You must start with more than 0 credits.");
            System.out.println("Exiting the game.");
            return;
        }
        System.out.println("You start with " + credits + " credits.\n");

        while (credits > 0) {
            System.out.println("You have " + credits + " credits.");
            System.out.print("Enter your bet (or type 0 to quit): ");

            int bet = scanner.nextInt();

            if (bet == 0) {
                break;
            }

            if (bet > credits) {
                System.out.println("You don't have enough credits for that bet. Try again.");
                continue;
            }

            if (bet <= 0) {
                System.out.println("Invalid bet amount. Bet must be greater than 0.");
                continue;
            }

            credits -= bet;

            String[] spinResult = new String[3];
            for (int i = 0; i < 3; i++) {
                spinResult[i] = symbols[(int) (Math.random() * symbols.length)];
            }

            System.out.println("Result: " + spinResult[0] + " | " + spinResult[1] + " | " + spinResult[2]);

            if (spinResult[0].equals(spinResult[1]) && spinResult[1].equals(spinResult[2])) {
                
                int winnings = bet * 5;  
                credits += winnings;
                System.out.println("Jackpot! You won " + winnings + " credits!");
            } else if (spinResult[0].equals(spinResult[1]) || spinResult[1].equals(spinResult[2]) || spinResult[0].equals(spinResult[2])) {
      
                int winnings = bet * 2;  
                credits += winnings;
                System.out.println("Two symbols match! You won " + winnings + " credits!");
            } else {
                System.out.println("No match! You lost your bet.");
            }

            System.out.println();
        }

        System.out.println("Game over! You ended with " + credits + " credits.");
        System.out.println("Thanks for playing the Slot Machine!");
        scanner.close();
    }
}