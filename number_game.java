import java.util.Random;
import java.util.Scanner;

public class number_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 5;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        
        do {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("I've generated a number between " + minRange + " and " + maxRange + ". Let's start guessing!");
            
            for (int attempts = 1; attempts <= maxAttempts; attempts++) {
                System.out.print("Attempt " + attempts + "/" + maxAttempts + ": Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! Your guess is correct.");
                    score += maxAttempts - attempts + 1;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }
                
                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you've run out of attempts. The correct number was " + targetNumber);
                }
            }
            
            System.out.print("Do you want to play again? (yes/no): ");
        } while (scanner.next().equalsIgnoreCase("yes"));

        System.out.println("Your total score is: " + score);
        System.out.println("Thank you for playing!");
    }
}
