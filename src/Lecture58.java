// Inheritance in interfaces,interfaces can extend another interfaces but we cant implement another interface only can do that.
interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface{
    public void meth1() {
        System.out.println("Meth1");
    }
    public void meth2() {
        System.out.println("Meth2");
    }
    public void meth3() {
        System.out.println("Meth3");
    }
    public void meth4(){
        System.out.println("Meth4");
    }
}
public class Lecture58 {
    public static void main(String[] args) {
        MySampleClass ob = new MySampleClass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
        ob.meth4();
    }
}
