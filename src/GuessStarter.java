import java.util.Random;
import java.util.Scanner;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {

        int guess;

        Scanner guessIt = new Scanner(System.in);

        //Prompting user
        System.out.println("""
                I'm thinking of a number between 1 and 100 (including both).\s
                Can you guess what it is?""");
        guess = guessIt.nextInt();
        System.out.printf("\nYour guess was: %d\n", guess);

        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("The number I was thinking of is: " + number);

        //Calculating difference
        int difference = guess - number;
        System.out.printf("\nYou were so close! It was just %d off!", difference);
    }

}
