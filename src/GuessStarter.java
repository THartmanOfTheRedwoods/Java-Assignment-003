import java.util.Random;
import java.util.Scanner;

public class GuessStarter {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        int guess = scanner.nextInt();
        System.out.println("Your guess: " + guess);
        System.out.println("The number I was thinking of is: " + number);
        int difference = Math.abs(number - guess);
        System.out.println("The difference between your guess and the number is: " + difference);
    }
}
