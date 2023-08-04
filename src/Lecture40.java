class MyEmployee{
    // Using Private access modifier
    private int id;
    private String name;
    public int getId(){
        return id;
    }
    public void setId(int i) {
        id = i;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
     name = n;
    }
}
public class Lecture40 {
    public static void main(String[] args) {
        MyEmployee ayush = new MyEmployee();
//        ayush.id = 18;
//        ayush.name = "Riju";      // Throws error due to private access modifier
        ayush.setId(18);
        System.out.println(ayush.getId());
        ayush.setName("Riju");
        System.out.println(ayush.getName());
    }
}
