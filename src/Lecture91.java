import java.util.*;
public class Lecture91 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(15);
        l2.add(18);
        l2.add(19);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(0,6);
        l1.add(0,5);
        l1.addAll(0,l2);
        System.out.println(l1.contains(19));    // True
        System.out.println(l1.indexOf(19));
        System.out.println(l1.lastIndexOf(4));
        l1.set(1,55);
    //    l1.clear();
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
