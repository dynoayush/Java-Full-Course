public class Lecture34 {
      //    static int factorial(int n){       // factorial of a function
//        if(n==0||n==1){                      // recursive method
//            return 1;
//        }
//        else{
//            return n * factorial(n-1);
//        }
//    }
//    static int factorial_iterative(int n){        // iterative method using for loop
//        if(n==0||n==1){
//            return 1;
//        }
//        else{
//            int product = 1;
//            for(int i=1;i<=n;i++){
//                product *=i;
//            }
//            return product;
//        }
//    }
//    public static void main(String[] args) {
//        int n=4;
//        System.out.println("The value of factorial n is: " +factorial(n));
//        System.out.println("The value of factorial n is: " +factorial_iterative(n));
//      }
      static int fibonacci(int n) {        // fibonacci of a function
            if (n == 0) {
                  return 0;
            }
            if (n == 1 || n == 2) {
                  return 1;
            }
            return (fibonacci(n - 1) + fibonacci(n - 2));
      }

      public static void main(String[] args) {
            int n = 9;
            System.out.println(fibonacci(n));
            for (int i = 0; i <= n; i++) {
                  System.out.print(fibonacci(i) + " ");
            }
      }
}


