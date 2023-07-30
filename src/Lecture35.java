public class Lecture35 {
    // Question 1
//    static void multiplication(int n){
//        for(int i=1;i<=10;i++){
//            System.out.format("%d * %d = %d\n",n , i,n * i);
//        }
//        System.out.println(" ");
//    }
//    public static void main(String[] args) {
//        multiplication(7);
    // Question 2
//    static void pattern1(int n) {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        pattern1(4);
    //Question 3
//    static int sumRec(int n){     // Sum of first n natural numbers
//        if(n==1){      // Base Condition
//            return 1;
//        }
//        return n + sumRec(n-1);
//    }
//    public static void main(String[] args) {
//        int c = sumRec(4);
//        System.out.println(c);
//    }
    // Question 4
//    static void pattern2(int n) {
//        for (int i = n; i>0; i--) {
//            for (int j = 0; j < i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        pattern2(4);
//    }
     // Question 5
//    static int fibonacci(int n){
//        if(n==1||n==2){
//            return n-1;
//        }
//
//        return (fibonacci(n-1)+fibonacci(n-2));
//    }
//
//    public static void main(String[] args) {
//       int result = fibonacci(5);
//        System.out.println(result);
//    }
    // Question 6
//    static float average(float ...arr){
//        float total = 0;
//        for(float e: arr) {
//                total += e;
//            }
//        float avg = total/arr.length;
//            return avg;
//        }
//
//    public static void main(String[] args) {
//        System.out.println(average(20,30,60));
//    }
    // Question 7
//    static void pattern2recursive(int n) {
//        if (n==1) {
//            System.out.print("*");
//        }
//        else {
//            for (int i = 0; i < n; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            pattern2recursive(n-1);
//        }
//    }
//
//    public static void main(String[] args) {
//        pattern2(4);
//    }
    //Question 8
//    static void pattern1recursion(int n) {
//        if (n > 0) {
//            pattern1recursion(n - 1);
//            for (int i = 0; i<n; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        pattern1recursion(4);
//    }
    // Question 9
//    static float fahrenheit(float cel) {
//        float fahren = (cel * (9/5.0f)) + 32.0f;
//        return fahren;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(fahrenheit(16));
//    }
    // Question 10
    static int nSum(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
         sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println(nSum(num));
    }



}



