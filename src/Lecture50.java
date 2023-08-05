// Guess the number game project
import java.util.*;
import java.util.Random;
class Game1 {
    public int number;
    public int inputNumber;
    public int noofguesses = 0 ;
    public int getNoOfGuesses() {
        return noofguesses;
    }
    public void setNoOfGuesses() {
        this.noofguesses = noofguesses;
    }
    Game1() {
        Random rand = new Random();
        this.number = rand.nextInt(10);
    }
    void takeuserinput() {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber() {
        noofguesses++;
        if (inputNumber == number) {
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts",number,noofguesses);
            return true;
        }
        else if (inputNumber<number) {
            System.out.println("Too low...");
        }
        else if (inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }
}
public class Lecture50 {
    public static void main(String[] args) {
        Game1 g = new Game1();
        boolean b = false;
        while (!b) {
            g.takeuserinput();
            b = g.isCorrectNumber();
        }
    }
}
