import java.util.Random;
import java.util.Scanner;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {
        // pick a random number
        Scanner s = new Scanner(System.in);
        System.out.print("Number that user guess: ");
        String guess = s.nextLine();
        int receiecedguess = Integer.parseInt(guess);
        //System.out.print("user input: ");
        //String input = s.nextLine();
        //int receiveinput = Integer.parseInt(input);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.printf("Number guess is: %d%n",receiecedguess);
        System.out.printf("number that was generated: %d",number);
    }

}
