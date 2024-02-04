import java.util.Random;
import java.util.Scanner;

public class GuessStarter {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = rand.nextInt(100) + 1;
        System.out.println("Guess the random whole number between 1 and 100: ");
        int guessResult = scanner.nextInt();
        System.out.println("You said: " + guessResult);
        System.out.println("The number I was thinking of is: " + number);
        if (number == guessResult) {
            System.out.println("Wow, Great guess!  You got it right!");}
        else {
            System.out.print("Unfortunately, you were off by; " + (guessResult - number));
        }
        /* For the sake of testing my code, I tried entering 5000 as the guess.  While the script
        found its number within the defined parameters, it still calculated the difference
        from what I entered as a guess result of 5000.
        Further experimenting, I tried a number with a decimal and partial number, and
        the program generated a string of error results.  I'm having difficulty with remembering things,
        by Grabthar's Hammer, I WILL try things and learn!
        */
    }
}