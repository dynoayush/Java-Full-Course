import java.util.Scanner;
// Making custom exception
class MyException extends Exception{
//    public String toString(){
//        return super.toString() + "I am toString()";
//    }
//    public String getMessage() {
//        return super.getMessage() + " I am getMessage() ";
//    }
    public String toString(){
        return "I am toString()";
    }
    public String getMessage() {
        return "I am getMessage() ";
    }
}
public class Lecture83 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a<99){
            try {
                throw new MyException();     // While throwing an exception we used to surround it with try and catch block
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();               // shows the exception present in the program
                System.out.println("Finished");
            }
            System.out.println("Program is finished");
        }
    }
}
