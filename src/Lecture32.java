public class Lecture32 {
//    static void telljoke(){                   when we don't want to return anything we use void return type
//        System.out.println("I invented a word Plagiarism");
//    }
//    static void change(int a){
//        a=68;
//    }
//    static void change2(int [] arr){
//        arr[0]=98;
//    }
//    public static void main(String[] args) {
//        int [] marks = {32,77,68,65,56};      // Changing the array
//        change2(marks);
//        System.out.println(marks[0]);
//        telljoke();
//        int x =55;          Changing the integer
//        change(x);
//        System.out.println(x);
    // Method Overloading
    static void foo(){
        System.out.println("Good Morning ");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + " hello");
    }
    static void foo(int a,int b){                          // here int a and int b are the parameter
        System.out.println("Good morning " + a + " hello");
        System.out.println("Good morning " + b + " hello");

    }

    public static void main(String[] args) {
        foo();
        foo(30);                                        // here 30 given in the value of a are the argument
        foo(30,33);                                  // Arguments are actual!
    }
   }
