interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){                       // we cant be able to call greet method in the class where the interfaces are implemented cause its private.
        System.out.println("Good Morno");
    }
    default void record4kVideo(){                // default method in interfaces
        greet();                                 // if the logic in the default method is too big then we can use private to sort it down cause its only applicable in the MyCamera interface...
        System.out.println("Recording in 4k...");
    }
}
interface MyWifi{
    String [] getNetworks();
    void connectToNetwork(String Network);
}
class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling" + phoneNumber);
    }
    void pickCall() {
        System.out.println("Connecting....");
    }
}
class MySmartPhone extends MyCellPhone implements MyCamera,MyWifi{
        public void takeSnap(){
       System.out.println("Take snap");
    }
    public void recordVideo(){
       System.out.println("Record a video");
    }
    // Override due to overridden method this will only work
    public void record4kVideo(){
       System.out.println("Record a video in 4k");
    }
    public String[] getNetworks() {
        System.out.println("Getting list of networks");
        String[] networkList = {"Harry","Ayush","Buli"};
        return networkList;
        }
    public void connectToNetwork(String Network) {
            System.out.println("Connecting to " + Network);
        }
    }
public class Lecture57{
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4kVideo();
    //    ms.greet();     throws an error...
        String[] ar = ms.getNetworks();
        for(String item:ar){
            System.out.println(item);
        }


    }

}
