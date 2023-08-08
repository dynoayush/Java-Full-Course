// Polymorphism using interfaces
interface MyCamera1{
    void takeSnap();
    void recordVideo();
    default void record4kVideo(){
        System.out.println("Recording in 4k...");
    }
}
interface MyWifi1{
    String [] getNetworks();
    void connectToNetwork(String Network);
}
class MyCellPhone1 {
    void callNumber(int phoneNumber) {
        System.out.println("Calling" + phoneNumber);
    }
    void pickCall() {
        System.out.println("Connecting....");
    }
}
class MySmartPhone1 extends MyCellPhone1 implements MyCamera1,MyWifi1{
    public void takeSnap(){
        System.out.println("Take snap");
    }
    public void recordVideo(){
        System.out.println("Record a video");
    }
    public void record4kVideo(){        // Override due to overridden method this will only work
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
public class Lecture59{
    public static void main(String[] args) {
        MyCamera1 cam1 = new MySmartPhone1();   //This is a smartphone but use it only as a camera...
//      cam1.getNetworks();  not allowed...
        cam1.record4kVideo();
        cam1.recordVideo();
        cam1.takeSnap();
        MySmartPhone1 s = new MySmartPhone1();
        s.getNetworks();
        s.recordVideo();
        s.record4kVideo();
        s.callNumber(123);
        s.pickCall();
    }

}

