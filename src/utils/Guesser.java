package utils;

import java.util.Random;

public class Guesser {
    private final int value;

    public Guesser() {
        Random r = new Random();
        this.value = (int) (r.nextDouble() * 100);
    }

    public Result checkGuess(int guess) {
        if(guess == this.value) {
            System.out.println("ACERTOU");
            return Result.EQUAL;
        } else if(guess < this.value) {
            System.out.println("Chute muito baixo, tente aumentar o valor!");
            return Result.LESSTHAN;
        } else {
            System.out.println("Chute muito acima, tente diminuir o valor!");
            return Result.GREATER;
        }
    }

}
