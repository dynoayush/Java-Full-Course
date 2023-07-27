import java.util.*;
public class Lecture23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        for(int i=1;i<=10;i++){
//            System.out.println(i);
//        }
//      2*i = Even Numbers = 0,2,4,6,8
//      2*i+1 = Odd Numbers = 1,3,5,7,9
//       int n = 5;
//       for (int i=0;i<n;i++){
//           System.out.println(2*i+1);
//       }
//        for(int i=5;i>0;i--){
//            System.out.println(i);
//        }
        System.out.println("Enter the limit of natural numbers");
        int n =sc.nextInt();
        for(int i=n;i>0;i--){
            System.out.println(i);

        }
    }
}
