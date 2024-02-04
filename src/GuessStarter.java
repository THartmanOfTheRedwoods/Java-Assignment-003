/**
 * @author Trevor Hartman
 * @author Andrew Escarcega
 *
 * @since 02/04/24
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

        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        System.out.print("Enter number: ");
        int numberG;
        Scanner scan = new Scanner(System.in);
        numberG = scan.nextInt();

        System.out.println("Your guess was " + numberG);
        System.out.println("The number I was thinking of is " + number);
        int difference = Math.abs(number - numberG);
        //looked up how to make it so that a number is not negative in java not sure if there is a better way
        System.out.println("The difference between your guess and the number I was thinking of is " + difference);

    }

}
