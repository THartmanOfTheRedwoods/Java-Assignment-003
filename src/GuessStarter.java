import java.util.Random;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        System.out.println("Im thinking of a number between 1 and 100. Can you guess what it is?");
        System.out.print("The number I was thinking of is: ");
        int guessnumber = random.nextInt (100) + 1;
        System.out.println(guessnumber);
        System.out.print("The number is: ");
        int number = random.nextInt(100) + 1;
        System.out.println(number);
        int difference;
        difference = (guessnumber - number);
        System.out.print("the difference is: ");
        System.out.println(guessnumber - number);





    }

}
