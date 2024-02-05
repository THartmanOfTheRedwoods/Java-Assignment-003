import java.util.Random;
import java.util.Scanner;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your guess: ");

        int userGuess = scanner.nextInt();

        System.out.println("You guessed: " + userGuess);

        System.out.println("The number I was thinking of is: " + number);

        int difference = Math.abs(userGuess - number);
        System.out.println("The difference between your guess and the actual number is: " + difference);

        scanner.close();
    }

}
