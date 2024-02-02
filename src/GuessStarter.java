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

        //create scanner
        Scanner scanner = new Scanner(System.in);

        //prompt the user
        System.out.println("I'm thinking of a number between 1 and 100 (including both). " +
                "Can you guess what it is?");
        System.out.println("Enter your guess: ");

        //read input from keyboard
        int guess = scanner.nextInt();

        //display users guess
        System.out.println("Your guess:" + guess);

        //display random number
        System.out.println("The number I was thinking of is: " + number);

        //calculate difference
        int difference = (number - guess);

        //display difference
        System.out.println("The difference between your guess and the correct number is " + difference);








    }

}
