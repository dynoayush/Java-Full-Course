//class MyThr extends Thread{
//    public MyThr (String name){
//        super(name);
//    }
//
//    @Override
//    public void run() {
//        int i=0;
//        while(i<10){
//            System.out.println("I am a thread");
//            i++;
//        }
//    }
//}
class MyThr1 implements Runnable{
    private String name;
    public void run()
        {
            System.out.println("The thread is running  ... " +name);
        }
    public MyThr1 (String name){
        this.name = name;
    }
}
public class Lecture73 {
    public static void main(String[] args) {
//     MyThr t = new MyThr("Ayush");
//     MyThr t1 = new MyThr("Surya");
//     t.start();
//     t1.start();
//        System.out.println(t.getId());
//        System.out.println(t.getName());
//        System.out.println(t1.getId());
//        System.out.println(t1.getName());
        Runnable r1 = new MyThr1("Riju");
        Runnable r2 = new MyThr1("Ayush");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
