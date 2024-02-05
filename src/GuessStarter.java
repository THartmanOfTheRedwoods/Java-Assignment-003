import java.util.Random;
import java.util.Scanner;
// Trevor Hartman
// Tanner Wilson
public class GuessStarter {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        System.out.print("Your guess: ");
        Scanner scanner = new Scanner(System.in);
        int userGuess = scanner.nextInt();
        System.out.println("You guessed: " + userGuess);
        System.out.println("The number I was thinking of is: " + number);
        int difference = Math.abs(userGuess - number);
        System.out.println("The difference is: " + difference);
    }
}
