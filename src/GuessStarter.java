/**
 * @author Trevor Hartman
 * @author Alexei Iachkov
 * @version 1
 * @date 1-3-24
 */

//import scanner and random
import java.util.Random;
import java.util.Scanner;

public class GuessStarter {

    public static void main(String[] args) {

        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);

        //Prompt user
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        System.out.print("Guess a number or else!: ");

        Scanner in = new Scanner(System.in);

        //Get user input
        int guess = in.nextInt();
        System.out.println("You guessed: " + guess);

        //Show random number
        System.out.println("The number I was thinking of is: " + number);

        //Calculate and display the difference
        int difference = (number - guess);
        System.out.print("The difference between the number I was thinking of and your guess is: " + difference);















    }

}
