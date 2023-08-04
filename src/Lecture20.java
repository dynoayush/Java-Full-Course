import java.util.Random;
import java.util.Scanner;

public class Lecture20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock,1 for Paper,2 for Scissors");
        int userinput = sc.nextInt();
        Random random = new Random();
        int computerinput = random.nextInt(3);
        if (userinput==computerinput){
            System.out.println("Draw");
        }
        else if(userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 0 || userinput == 2 && computerinput ==1){
            System.out.println("You win");
        }
        else {
            System.out.println("Computer win");
        }
        if(computerinput == 0){
            System.out.println("Computer choice: Rock");
        }
        else if(computerinput == 1){
            System.out.println("Computer choice: Paper");
        }
        else if(computerinput == 2){
            System.out.println("Computer choice: Scissors");
        }

    }
}
