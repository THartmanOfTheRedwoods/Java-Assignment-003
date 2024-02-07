import java.util.Random;
import java.util.Scanner;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {
        String newLine = System.lineSeparator();
        Scanner numInput = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100." + newLine + "Can you guess what it is?");
        // pick a random number
        int userGuess = numInput.nextInt();
        System.out.println("Your Guess is:" + userGuess + "?");
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("The number that I was thinking of is:" + number);
        int difference = Math.abs(userGuess - number);
        //Absolute value of difference
        System.out.println("Your guess was off by: " + difference);
    }
}
