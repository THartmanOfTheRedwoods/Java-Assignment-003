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
        Scanner scanner = new Scanner(System.in);
        System.out.printf("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        int guess = scanner.nextInt();
        System.out.println("The number I was thinking of was " + number);
        int difference = Math.abs(number-guess);
        System.out.printf("The difference is " + difference);
    }

}
