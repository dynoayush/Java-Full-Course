interface Bicycle{
    int a = 445;
    void applyBrake(int decrement);
    void sppedUp(int increment);
}
interface HornBicycle{
    void blowHornK1();
    void blowHornK2();
}
class HeroCycle implements Bicycle,HornBicycle{       // 2 interfaces are implemented in a single class,it is not possible in abstract class...
    void blowhorn(){
        System.out.println("Poo Pee Pee Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brake");
    }
    public void sppedUp(int increment){
        System.out.println("Applying speed");
    }
    public void blowHornK1(){
        System.out.println("I am there");
    }
    public void blowHornK2(){
        System.out.println("I am also there");
    }
}
class Hero extends HeroCycle implements Bicycle,HornBicycle{   // we can also use extends keyword together with implements in interface,it is not possible in abstract..
    public void applyBrake(int decrement){
        System.out.println("Applying less brake");
    }
    public void sppedUp(int increment){
        System.out.println("Applying more speed");
    }
    public void blowHornK1(){
        System.out.println("I am there too");
    }
    public void blowHornK2(){
        System.out.println("I am also there too");
    }
}
public class Lecture55 {
    public static void main(String[] args) {
        HeroCycle h = new HeroCycle();
        h.sppedUp(1);
        h.applyBrake(2);
        h.blowHornK1();
        h.blowHornK2();
        System.out.println(h.a); // we cant be able to change the values which are already present in the interface....
        Hero o = new Hero();
        o.applyBrake(1);
        o.blowHornK1();
        System.out.println(o.a);
    }
}
