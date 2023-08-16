class MyThre extends Thread{
    public MyThre (String name){
        super(name);
    }

    @Override
    public void run() {
        int i=0;
        while(i<5){
            System.out.println("I am a thread " +this.getName());
            i++;
        }
    }
}
public class Lecture74 {
    public static void main(String[] args) {
     MyThre t = new MyThre("Ayush");
     MyThre t1 = new MyThre("Surya");
     MyThre t2 = new MyThre("Raju");
     MyThre t3 = new MyThre("Sun");
     t.setPriority(Thread.MAX_PRIORITY);
     t1.setPriority(Thread.MIN_PRIORITY);
     t2.setPriority(Thread.MIN_PRIORITY);
     t3.setPriority(Thread.MIN_PRIORITY);
     t.start();
     t1.start();
     t2.start();
     t3.start();
    }
}
