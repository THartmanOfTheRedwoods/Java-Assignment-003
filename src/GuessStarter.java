import java.util.Random;
import java.util.Scanner;
/**
 * Completed "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {
        // Pick a random number and declare game to user
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");

        // Prompt user to type a number
        Scanner in = new Scanner(System.in);
        System.out.print("Type a number to guess: ");
        int guess = in.nextInt();

        // Display user's guess
        System.out.printf("You guessed %d.\n", guess);

        // Display generated number
        System.out.printf("The number I was thinking of is: %d\n", number);

        // Calculate and display difference between user's guess and generated number
        int difference = Math.abs(number - guess);
        System.out.printf("The difference between my number and your guess was %d.", difference);
    }
}
