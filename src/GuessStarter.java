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
        //System.out.println(number);

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");
        System.out.println("Type your guess: ");

        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();

        System.out.println("Your guess was: " + guess);
        System.out.println("The number im thinking of is: " + number);

        int difference = Math.abs(number - guess);
        System.out.println("The difference between my number and your guess is: " + difference);
        scanner.close();

    }

}
//picking random number
//print instructions for user input
//user inputs any number
//reads input from user
//displays users input
//prints the random number
//displays the difference from user and random generated number

