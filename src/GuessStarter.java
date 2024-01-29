import java.util.Random;
import java.util.Scanner;

public class GuessStarter {

    public static void main(String[] args) {

        //Retry feature
        boolean playAgain = true;

        while (playAgain) {
            playAgain = mainMethod();
        }

        System.out.println("Thanks for playing!");

    }

    private static boolean mainMethod() {

        Scanner input = new Scanner(System.in);
        int randomNumber = numberGenerator();

        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        System.out.print("Enter your guess: ");
        int enteredNumber = input.nextInt();

        String variableString; //Adding a little 'spice'
        if (enteredNumber >= 1 && enteredNumber <= 100) {
            variableString = "good luck!";
        }   else {
            variableString = "are you trying to lose?";
        }

        System.out.printf("Your entered guess was %d, %s\n", enteredNumber, variableString);

        System.out.printf("The number I was thinking of was %d\n", randomNumber);

        int difference = randomNumber - enteredNumber;

        if (difference == 0) {
            System.out.println("YOU WIN!");
        }
        else if (difference < 0) {
            difference *= -1;
            System.out.printf("You were only %d away from getting the correct number\n",difference);
        }
        else {
            System.out.printf("You were only %d away from getting the correct number\n",difference);
        }

        System.out.println("Would you like to play again? If so, enter 1.");

        return input.nextInt() == 1;

    }

    private static int numberGenerator() {
        Random random = new Random();
        return random.nextInt(101);
    }

}
