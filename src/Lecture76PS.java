class practice1 extends Thread{
    @Override
    public void run() {
       while (true){
           try {
               Thread.sleep(200);
           } catch (Exception e) {
               System.out.println(e);
           }
           System.out.println("Good Morning");
       }
    }
}
class practice2 extends Thread{
    @Override
    public void run() {
//       while (true){
//           try {
//               Thread.sleep(200);
//           }
//           catch (Exception e) {
//               System.out.println(e);
//           }
//           System.out.println("Welcome");
//       }
    }
}
public class Lecture76PS {
    public static void main(String[] args) {
       practice1 p = new practice1();
       practice2 q = new practice2();
       p.setPriority(6);
       q.setPriority(9);
//        System.out.println(p.getPriority());
//        System.out.println(p.getState());
        System.out.println(q.getPriority());
        System.out.println(q.getState());
//      p.start();
        q.start();
        System.out.println(q.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
