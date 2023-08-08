// Question 1 and 2
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib of the pen");
    }
}
// Question 3 and 5
interface BasicAnimal{
    void eat();
    void sleep();
}
class monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}
class Human extends monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eats a lot");
    }
    public void sleep(){
        System.out.println("Sleeps a lot");
    }
    void speak(){
        System.out.println("Hello");
    }
}
// Question 4
abstract class Telephone{
  abstract void ring();
  abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{
    void ring(){
        System.out.println("Ringing...");
    }
    void lift(){
        System.out.println("Lifting...");
    }
    void disconnect(){
        System.out.println("Disconnecting...");
    }
    void music(){
         System.out.println("Music...");
    }
}
// Question 6 and 7
interface TvRemote{
    void Remote1();
    void Remote2();
}
interface SmartTvRemote extends TvRemote{
    void Remote3();
    void Remote4();
}
class Tv implements SmartTvRemote{
    public void Remote1(){
        System.out.println("One");
    }
    @Override
    public void Remote2() {
        System.out.println("Two");
    }
    @Override
    public void Remote3() {
        System.out.println("Three");
    }
    @Override
    public void Remote4() {
        System.out.println("Four");
    }
}

public class Lecture60PS {
    public static void main(String[] args) {
        // Question 1 and 2
//     FountainPen pen = new FountainPen();
//      pen.changeNib();
      // Question 3 and 5
//        Human h = new Human();
//        h.eat();
//        h.sleep();
//        h.bite();
//        h.jump();
//        h.speak();
//        monkey m1 = new Human();    // polymorphism here runs only the monkey class(obj is created of only monkey class)..
//        m1.bite();
//        m1.jump();
//        BasicAnimal ba = new Human();
//        ba.eat();
//        ba.sleep();
        // Question 4
//        Telephone t = new SmartTelephone();
//        t.ring();
//        t.lift();
//        t.disconnect();
//        t.music();        it would not run cause it is not present in the abstract telephone class
        //Question 6
        Tv t = new Tv();
        t.Remote1();
        t.Remote2();
        t.Remote3();
        t.Remote4();



    }
}
