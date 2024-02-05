import java.util.Random;
import java.util.Scanner;
/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {
    public static void main(String[] args) {
        // adding a Scanner
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number");
        int input = Integer.parseInt(s.nextLine());
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("I was thinking of the number "+number);
        System.out.println(input-number);
    }

}
