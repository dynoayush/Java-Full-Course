// Guess the number game project
import java.util.*;
class Game{
     int timetocount;
     int myguess;
     int computerguess;

    public Game(){
        computerguess = (int)(Math.random()*10);
    }
    public void setNumber(int n){
        myguess = n;
    }
    public int isCorrect(){
        if(myguess == computerguess){
            return 0;
        }
        else if(myguess > computerguess){
            return -1;
        }
        else{
            return 1;
        }
    }
    public void setCounter(){
        timetocount++;
    }
    public void getCounter(){
        System.out.println("The number of guesses were " +timetocount);
    }
}
public class Lecture43 {
    public static void main(String[] args) {
        Game obj = new Game();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number between 1 to 10 (1-10): ");
            int n = sc.nextInt();
            obj.setNumber(n);

            if(obj.isCorrect() == 0){
                obj.setCounter();
                System.out.println("Congratulations!! You have guessed the correct number");
                obj.getCounter();
                break;
            }
            else if(obj.isCorrect() == -1){
                obj.setCounter();
                System.out.println("Enter smaller number!!");
            }
            else if(obj.isCorrect() == 1){
                obj.setCounter();
                System.out.println("Enter larger number!!");
            }
        }
    }
}

