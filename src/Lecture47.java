class random{
    int a;
    public int getA() {
        return a;
    }
    random(int a){
       this.a=a;
    }
    public int returnnone() {
        return 1;

    }
}
class random2 extends random{
    random2(int c){
        super(c);
        System.out.println("I am a constructor");
    }
}
public class Lecture47 {
    public static void main(String[] args) {
        random e = new random(5);
        random2 f = new random2(7);
        System.out.println(e.getA());
    }
}
