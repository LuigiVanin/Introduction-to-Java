import java.util.Scanner;

import utils.Guesser;
import utils.Result;



/**
 * This is a very simple program in Java that creates guess game.
 * To play the game the player have to insert a integer value on the prompt,
 * if the guess is equal to the value generated at the start of the program the user win
 * and the program ends, if the value is incorrect  
 * the user have to insert another value until it is the currect one.
 */
public class Program {

    public static void main(String[] aStrings) {
        Guesser result = new Guesser();
        
        System.out.println("-- GUESS GAME --!!\n\n Try to guess values between 0 ~ 100\n");
        Scanner inputReader = new Scanner(System.in);
        while(true) {

            try {
                System.out.println("Make a guess: Insert a intergent value:");

                int guess = inputReader.nextInt();
                Result r = result.checkGuess(guess); 
                if(r == Result.EQUAL) {
                    System.out.println("The value was: " + guess);
                    break;
                }
                
            } catch(Error e) {
                System.out.println("The value is not valid, try again");
                continue;
            }
        }
        inputReader.close();
    }
}
