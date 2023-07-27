import java.util.Scanner;
public class Lecture5 {
    public static void main(String[] args) {
        System.out.println("Talking input from the user ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        float a = sc.nextFloat();
        System.out.println("Enter number 2");
        float b = sc.nextFloat();
        float sum = a+b;
        System.out.println("The sum of these numbers is ");
        System.out.println(sum);


    }
}
