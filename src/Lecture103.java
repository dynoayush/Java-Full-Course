class InvalidInputException extends Exception{
    public String toString(){
        return "Cant add 8 and 9";
    }
    public String getMessage(){
        return " I am getMessage()";
    }
}
class CannotDivideByZeroException extends Exception{
    public String toString(){
        return "Cant be divided by zero";
    }
    public String getMessage(){
        return " I am getMessage()";
    }
}
class MaxInputException extends Exception {
    public String toString() {
        return "Maximum Input cant be greater than 100000";
    }

    public String getMessage() {
        return " I am getMessage()";
    }
}
class MaxMultiplyInputException extends Exception{
    public String toString(){
        return "Maximum Input cant be greater than 7000";
    }
    public String getMessage(){
        return " I am getMessage()";
    }
}
class CustomCalculator {
    double add(double a,double b) throws InvalidInputException,MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(a==8 || b==9 ){
            throw new InvalidInputException();
        }
        return a+b;
    }
    double substract(double a,double b) throws MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a-b;
    }
    double multilply(double a,double b) throws MaxInputException,MaxMultiplyInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        } else if (a>7000 || b>7000) {
            throw new MaxMultiplyInputException();
        }
        return a*b;
    }
    double divide(double a,double b) throws CannotDivideByZeroException,MaxInputException {
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(b==0){
            throw new CannotDivideByZeroException();
        }
        return a/b;
    }
}
public class Lecture103 {
    public static void main(String[] args) throws InvalidInputException,CannotDivideByZeroException,MaxInputException,MaxMultiplyInputException{
        CustomCalculator c = new CustomCalculator();
//        c.add(8,9);
//        c.divide(6,0);
//       c.multilply(8000,8000);
        c.divide(200000,3000000);

    }
}
