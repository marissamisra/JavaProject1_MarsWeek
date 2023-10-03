import java.util.Scanner;
import java.util.Random;

public class GuessingGame{
    Scanner scan;
    Random randomNumberGenerator;
    String playerName;
    int randomNumber;
    int playerNumber;
    int count;
    boolean guessIsCorrect;

    public GuessingGame(){
        scan = new Scanner(System.in);
        randomNumberGenerator = new Random();
        playerName = "Box_Elder";
        randomNumber = randomNumberGenerator.nextInt(100);
        playerNumber = 0;
        count = 0;
        guessIsCorrect = false;
    
    }

    public static void main(String[] args){
    }

    public void playerName(){
        System.out.println("\n\nWelcome to the guessing game! \nWhat is your name?");
        playerName = scan.nextLine();

        System.out.println("\nWelcome, " + playerName + "!");
    }

    public void playerGuess(){
        while (!guessIsCorrect){
            if (count == 0){
                System.out.println("Take your first guess!");
                playerNumber = scan.nextInt();
            }
            else {
                System.out.println("Next guess:");
                playerNumber = scan.nextInt();
            }
            guessIsCorrect = checkUserGuess(playerNumber, randomNumber);
            count++;
         }
        System.out.println("\nIt took you " + count + " guesses.\n\n");

    }

    public static boolean checkUserGuess(int guess, int actualNumber){
        if (guess == actualNumber){
            System.out.println("\nCongratulations! The random number was: " + actualNumber);
            return true;

        } else if (guess < actualNumber){
            System.out.println("Try a little higher\n");
            return false;

        } else {
            System.out.println("Try a little lower\n");
            return false;
        }

    }
}