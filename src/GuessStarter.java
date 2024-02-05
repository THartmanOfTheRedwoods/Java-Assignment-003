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
        Scanner in = new Scanner(System.in);
        System.out.print("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?: ");
        int guess = in.nextInt();
        System.out.println("Your guess: "+ guess);
        System.out.print("The number I was thinking of is: " + number);
        System.out.print("\nThe difference is: " + Math.abs(number - guess));
    }

}

