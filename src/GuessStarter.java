import java.util.Random;
import java.util.Scanner;

/**
 * Starter code for the "Guess My Number" exercise.
 *
 * @author Trevor Hartman
 * @author Eliot Rodriguez
 *
 * @since version 1.0
 * January 30, 2024
 *
 */
public class GuessStarter {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        System.out.println("Type your answer here: ");
        int response = scanner.nextInt();
        System.out.println("Your guess was "+ response);
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("The number I was thinking of is: " + number);
        int difference = number-response;
        System.out.println("the difference between your guess and the correct number was: " + difference);

    }

}
