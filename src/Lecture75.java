class MyNewThread1 extends Thread{
    public void run() {
        int i=0;
        while(true){
            System.out.println("I am a thread ");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
class MyNewThread2 extends Thread{
    public void run() {
        int i=0;
        while(i<5){
            System.out.println("I am a thread 1 ");
            i++;
        }
    }
}
public class Lecture75 {
    public static void main(String[] args) {
    MyNewThread1 t1 = new MyNewThread1();
    MyNewThread2 t2 = new MyNewThread2();
    t1.start();
    try {
        t1.join();      // this helps the computer to finish executing the first thread and then execute the next.
    }
    catch (Exception e){
        System.out.println(e);
    }
    t2.start();
    }
}
