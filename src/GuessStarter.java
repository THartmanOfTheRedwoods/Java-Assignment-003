/**
 * @author Trevor Hartman
 * @author Jenny Li
 * @Version 1.0
 * 2/4/24
 */

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

        Scanner r = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

        System.out.print("Guess a number: ");
        int guess;
        guess = r.nextInt();

        System.out.println("The number I was thinking of is: " + number);
        System.out.println("The difference was: " + (number - guess));
    }

}
