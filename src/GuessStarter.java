/*
Quinn McKay
2/2/2024
Java Assignment 03
 */



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

        int number_guess;
        Scanner guess = new Scanner(System.in);

        System.out.print("I am thinking of a number between 1 and 100. ");
        System.out.println("Can you guess what it is?");
        System.out.print("Guess: ");
        number_guess = guess.nextInt();

        System.out.println("Your guess was: " + number_guess);
        System.out.println("The number I was thinking of was: " + number);

        System.out.print("The difference between your number and my number is: ");
        System.out.println(number_guess - number);



    }

}
