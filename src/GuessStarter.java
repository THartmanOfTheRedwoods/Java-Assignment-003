import java.util.Random;
import java.util.Scanner;
public class GuessStarter {

    // * Starter code for the "Guess My Number" exercise.
    public static void main(String[] args) {
        // pick a random number
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        Scanner guess = new Scanner(System.in);
        Random random = new Random();
        int playerGuess = guess.nextInt();
        int randomNumber = random.nextInt(100) + 1;

        System.out.println("You Guessed " + playerGuess);
        System.out.println("The number I was thinking of is:" + randomNumber);
        if (playerGuess == randomNumber) {
            System.out.println("Correct! You Win!");
        }
        else {
            //if (playerGuess != randomNumber) {
            System.out.println("Sorry, you were off by " + (playerGuess - randomNumber));
        }

        guess.close();

    }
}
