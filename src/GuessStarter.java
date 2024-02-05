import java.util.Random;
import java.util.Scanner;
/**
 * Editors note here I had a lot of fun with this just thought you would like my opinion on this and thinking outside the box
 * Author Kelten Stowe
 * Author Trevor Hartman
 * Date 2/4/2024
 *  Starter code for the "Guess My Number" exercise.
 */
import java.util.Random;

public class GuessStarter {
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        // prompt the user for a guess
        System.out.print("Guess the number (between 1 and 100): ");
        // use Scanner to read user input as an integer
        Scanner scanner = new Scanner(System.in);
        int Guess = scanner.nextInt();
        // display the user's guess
        System.out.println("Your guess: " + Guess);
        // compute and display the difference between user's guess and the generated number
        int difference = Math.abs(number - Guess);
        System.out.println("The difference between the generated number and your guess is: " + difference);
        // close the scanner
        scanner.close();
    }
}
