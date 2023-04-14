package ProblemSolving;

import java.util.Scanner;

public class GuessDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToBeGuess= 10;
        System.out.println("Guess a number between 1-31");
        int userInput = scanner.nextInt();
        while (userInput != numberToBeGuess){
            if (userInput > numberToBeGuess){
                System.out.println("Your guess is too high");
                userInput = scanner.nextInt();
            }
            if (userInput < numberToBeGuess){
                System.out.println("Your guess is too low");
                userInput = scanner.nextInt();
            }else
                System.out.println("Well-done, you guessed right");

        }
    }
}
