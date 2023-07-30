public class Lecture33 {
//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }
    static int sum(int ...arr){       // available as int [] arr or integer array
        int result=0;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to tutorial");
        System.out.println(sum());
        System.out.println(sum(4,5));
        System.out.println(sum(4,5,6));
    }
}
