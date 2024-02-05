import java.util.Random;
import java.util.Scanner;
import java.util.stream.StreamSupport;

/**
 * Starter code for the "Guess My Number" exercise.
 * Author: Trevor Hartman
 * Author: Jaime Ortiz
 */
public class GuessStarter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // pick a random number
        Random random = new Random();

        int number = random.nextInt(100) + 1;

        System.out.println("Im thinking of a number between 1 and 100 (Including both). Can you guess what it is?");
        System.out.print("Your number: ");
        int userGuess = scanner.nextInt();

        System.out.println("Your guess was: " + userGuess);
        System.out.println("The number I was thinking of is: " + number);


        int difference = (number - userGuess);
        System.out.println("The difference was: " + difference);

        scanner.close();
    }

}
