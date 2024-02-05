import java.util.Random;
import java.util.Scanner;
/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {
        // pick a random number
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you Guess what it is?");
        int outNumber;
        Scanner integer=new Scanner(System.in);
        outNumber= integer.nextInt();

        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("The number you guessed was: "+outNumber);
        System.out.println("The number I was thinking of is: " + number);

        int calculation;
        calculation=Math.abs(outNumber-number);
        System.out.println("The difference between your guess and the number is: " + calculation);

    }

}
