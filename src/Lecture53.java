abstract class Parent2{     // we cant create objects of abstract class in main method
    Parent2(){
        System.out.println("I am constructor of base 2");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet1();
}
class Child2 extends Parent2{        // if abstract is written in front of this subclass Child2 then also we cant be able to create any obj.
    public void greet(){
        System.out.println("Good Morning");
    }
    public void greet1(){
        System.out.println("Good Morno");
    }
}
public class Lecture53 {
    public static void main(String[] args) {
    //    Parent2 p = new Parent2();   its not possible....
        Child2 c = new Child2();
        }
    }

