import java.util.Random;
import java.util.Scanner;
//*Austin Barnett
// 2/1/2024
// Version 1.0
public class GuessStarter {

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");

        System.out.print("Enter a number: ");
        int guess = scanner.nextInt();

        System.out.println("Your guess is: " + guess);

        int difference = number % guess;
        System.out.println("The number I was thinking of is: " + number);
        System.out.println("Missed by: " + difference);
    }
}
