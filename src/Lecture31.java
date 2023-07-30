public class Lecture31 {
    // First process to create methods(using static methods)
//    static int logic(int x,int y){
//        int z;
//        if(x>y){
//            z=x+y;
//        }else{
//            z=(x+y)*5;
//        }
//        return z;
//    }
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 7;
//        int c;
//        c=logic(a,b);
//        int a1 = 2;
//        int b1 = 1;
//        int c1;
//        c1 = logic(a1,b1);
//        System.out.println(c);
//        System.out.println(c1);
    // Second process to create methods (methods invocation using object creation)
    int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c;
        Lecture31 obj=new Lecture31();
        c=obj.logic(a,b);
        System.out.println(c);
    }
 }

