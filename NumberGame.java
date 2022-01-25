import java.util.Random;
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args){
        Random suiji = new Random();
        int randomNumber = suiji.nextInt(100) + 1;
        int numOfGuesses = 0;
        boolean gameContinues = true;
        System.out.println("Please enter a number between 1 and 100: ");
        while(gameContinues){
            Scanner saomiaoqi = new Scanner(System.in);
            int playerChoice = saomiaoqi.nextInt();
            numOfGuesses ++;
            if(randomNumber == playerChoice){
            System.out.println("Congrats! You've guessed correctly in " + numOfGuesses + " guesses!");
            gameContinues = false;
        }else if(randomNumber > playerChoice){
            System.out.println("Guess higher!: ");
        }else{
            System.out.println("Guess lower!: ");
        }
        }
    }
}
