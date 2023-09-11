@FunctionalInterface   // we can use only 1 method in functional interface
interface myFunctionalInterface{
    void thisMethod();
}
class NewPhone extends Phone{
    @Override
    public void showtime() {
        System.out.println("This is 8pm");
    }
//    @Deprecated
//    public void sum(int a,int b){
//        return a+b;
//    }
}
public class Lecture108 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showtime();
//        phone.sum(5,6);
    }
}
