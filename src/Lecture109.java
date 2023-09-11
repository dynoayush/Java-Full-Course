// Functional Interface
interface DemoAno{
    void meth(int a);
//    void meth2();
}
//class HarryFunc implements DemoAno{
//    @Override
//    public void meth() {
//        System.out.println("This is method 1");
//    }
//}
//class AnonyDemo implements DemoAno {
//    public void display() {
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth() {
//        System.out.println("I am meth1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am meth2");
//    }
//
//}
    public class Lecture109 {
        public static void main(String[] args) {
//            DemoAno obj = new AnonyDemo();
//            obj.meth();
            // Anonymous Class
//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth() {
//                System.out.println("I am meth1");
//            }
//        };
//        obj.meth();
//           DemoAno obj = new HarryFunc();
//           obj.meth();
            // Lambda Expression
            DemoAno obj = (a)->{
                System.out.println("I am method 1 from this lambda " +a);
            };
            obj.meth(6);

        }
    }

