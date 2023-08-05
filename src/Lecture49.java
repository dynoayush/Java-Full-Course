class Phone{
    public void showtime(){
        System.out.println("Good morning at 8");
    }
    public void name(){
        System.out.println("Nokia");
    }
}
class Smartphone extends Phone{
    public void music(){
        System.out.println("Despacito");
    }
    public void name(){
        System.out.println("Samsung");
    }
}
public class Lecture49 {
    public static void main(String[] args) {
//        Phone obj = new Phone();            // whenever new is written the object is created at the runtime and it also an example of runtime polymorphism
//        Smartphone obj1 = new Smartphone();
//        obj.name();
        Phone obj = new Smartphone();       // Dynamic method dispatch(here we are creating object smartphone under the parent phone) reverse is not possible
        // Smartphone obj = new Phone();    // its not allowed
        obj.showtime();
        obj.name();
        // obj.music();   I cant be able to execute cause it's not present in the parent class



    }
}
