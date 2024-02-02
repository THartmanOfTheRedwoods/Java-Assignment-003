import java.util.Random;
import java.util.Scanner;
import static java.lang.Math.abs;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {

        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        // prompt user to guess a number
        Scanner entry = new Scanner(System.in);
        System.out.print("I'm thinking of a number between 1 and 100 (including both). ");
        System.out.println("Can you guess what it is? ");
        int guess = entry.nextInt();

        // display user's guess, correct answer, and the difference.
        int difference = abs(number - guess);
        System.out.printf("You guessed %d. \n", guess);
        System.out.printf("The correct number was %d. \n", number);
        System.out.printf("The difference is %d.", difference);
    }

}
