import java.util.ArrayList;
class MyGeneric<T1>{
    int val = 344;
    private T1 t1;
    public MyGeneric(int val,T1 t1){
        this.val = val;
        this.t1 = t1;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}
public class Lecture110 {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>(); // <Integer> is the generic here
//        arrayList.add("str1");
//        arrayList.add(54);
//        arrayList.add(643);
//        int a =arrayList.get(2);
//        String b =(String) arrayList.get(0);
//        System.out.println(b);
//        System.out.println(a);
        MyGeneric<String> g1 = new MyGeneric(23,"MyString");
        String str = g1.getT1();
        System.out.println(str);
    }
}
