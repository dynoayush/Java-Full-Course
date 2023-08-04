class Base {
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
}
class Derived extends Base{       // here extends keyword is the inheritance used
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
class animal{
    int dog;
    public int getDog() {
        return dog;
    }
    public void setDog(int dog) {
        this.dog = dog;
    }
}
class birds extends animal{
    int parrot;

    public int getParrot() {
        return parrot;
    }

    public void setParrot(int parrot) {
        this.parrot = parrot;
    }
}
public class Lecture45 {
    public static void main(String[] args) {
        // Question 1
//     Base a = new Base();    // Object of base class
//     a.setX(4);
//     System.out.println(a.getX());
//     Derived b = new Derived();   //  Object of derived class
//     b.setX(5);
//     b.setY(5);
//     System.out.println(b.getX());
//     System.out.println(b.getY());
        //  Question 2
        animal a = new animal();
        a.setDog(4);
        System.out.println(a.getDog());
        birds b = new birds();
        b.setDog(5);
        b.setParrot(6);
        System.out.println(b.getDog());
        System.out.println(b.getParrot());
    }
}
