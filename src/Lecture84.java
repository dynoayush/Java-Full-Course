class NegativeRadiusException extends Exception {
    public String toString() {
        return "Radius cant be negative";
    }

    public String getMessage() {
        return "Radius cant be negative";
    }
}
public class Lecture84 {
    public static double area (int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r ;
        return result;
    }
//    public static int divide(int a,int b) throws ArithmeticException{
//        int result = a/b;
//        return result;
//    }
    public static void main(String[] args) {
        try {
//            int c = divide(6,0);
//            System.out.println(c);
            double ar = area(-1);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println("Exception");
        }

    }
}
