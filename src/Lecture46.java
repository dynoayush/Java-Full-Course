class Base1 {
    Base1() {
        System.out.println("I am base1 constructor");
    }
    Base1(int a){
        System.out.println("I am a overloaded constructor " +a);
    }
}
class Derived1 extends Base1{
    Derived1(){
         super(0);
        System.out.println("I am derived class constructor");
    }
    Derived1(int a,int b){
        super(a);
        System.out.println("I am a overloaded constructor " +b);
    }
}
class Childofderived extends Derived1{
    Childofderived(){
        System.out.println("I am a child of the derived");
    }
    Childofderived(int a,int b,int c){
        super(a,b);
        System.out.println("I am a overloaded constructor " +c);
    }
}
public class Lecture46 {
    public static void main(String[] args) {
     // Base1 b = new Base1();
        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(1,2);
    //  Childofderived c = new Childofderived();
      Childofderived c = new Childofderived(1,2,3);

    }
}
