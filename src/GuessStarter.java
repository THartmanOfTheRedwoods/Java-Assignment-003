import java.util.Random;
import java.util.Scanner;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int guessNumber;
        int difference;
        Scanner in = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        System.out.print("Pick a number: ");
        guessNumber = in.nextInt();
        if (randomNumber >= guessNumber) difference = randomNumber - guessNumber; else difference = guessNumber - randomNumber;
        System.out.println("Your number was: " + guessNumber);
        System.out.println("The number I thought of was: " + randomNumber);
        System.out.printf("Your guess was %d away from mine", difference);
        if (guessNumber == randomNumber) System.out.println(", Congratulations!");
    }

}
