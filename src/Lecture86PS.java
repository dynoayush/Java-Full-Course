import java.util.Scanner;
class MyOwnException extends Exception{
    @Override
    public String toString() {
        return "Invalid Input";
    }

    @Override
    public String getMessage() {
        return "Error";
    }
}
public class Lecture86PS {
    // Question 1
//        int a = 7      syntax error no semicolon
//        int age = 78;
//        int year = 2000-78;     logical error
//        System.out.println(6/0);   runtime error
        // Question 2
//        try {
//            int a = 666/0;
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("hehe");
//        }
//        catch (ArithmeticException e){
//            System.out.println("haha");
//        }
        // Question 3 and 4
//        boolean flag = true;
//        int[] marks = new int[3];
//        marks[0] = 7;
//        marks[1] = 56;
//        marks[2] = 6;
//        Scanner sc = new Scanner(System.in);
//        int index;
//        int i = 0;
//        while (flag && i < 5) {
//            try {
//                System.out.println("Enter the value of the index");
//                index = sc.nextInt();
//                System.out.println("The value of index is " + marks[index]);
//                break;
//            } catch (Exception e) {
//                System.out.println("Invalid index");
//                i++;
//            }
//        }
//        if (i >= 5) {
//            try {
//                throw new MyOwnException();
//            }
//            catch (Exception e) {
//                System.out.println(e.toString());
//            }
//        }
        // Question 5
        public static void main(String[] args) throws Exception {
                int size;
                int ind;
                int[] arr = new int[3];
                arr[0]=1;
                arr[1]=2;
                arr[2]=3;
                size=3;
                int count=0;

                while(count<5){
                    System.out.println("Enter a index");
                    Scanner sc = new Scanner(System.in);
                    ind = sc.nextInt();

                    if(ind>=size){
                        count++;

                        try{
                            if(count<5) System.out.println("Oops!! Try Again");
                            else throw new Exception();
                        }
                        catch(Exception e){
                            System.out.println("Error");
                        }

                    }
                    else{
                        System.out.println("Value is :: "+arr[ind]);
                        count=0;
                    }
                }
            }
        }


   
