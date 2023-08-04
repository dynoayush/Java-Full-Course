class MymainEmployee{
    private int id;
    private String name;
    private int salary;
    public MymainEmployee(){ // Constructor
        id = 18;
        name = "Riju";
        salary = 10000;
    }
    public MymainEmployee(int myid,String myname,int mysalary){ // Constructor with arguments
        id = myid;
        name = myname;
        salary = mysalary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    }
public class Lecture42 {
    public static void main(String[] args) {
        MymainEmployee ayush = new MymainEmployee(12,"Ram",12000);
        System.out.println(ayush.getId());
        System.out.println(ayush.getName());
        System.out.println(ayush.getSalary());

    }

}
