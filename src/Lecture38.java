class Employee1{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }
    public int getSalary(){
        return salary;
    }
}
public class Lecture38 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 ayush = new Employee1();   // Instantiating a new employee object
        Employee1 sima = new Employee1();   // Instantiating a new employee object
        // Setting attributes for ayush
        ayush.id=12;
        ayush.name="Riju";
        ayush.salary=1000;
        // Setting attributes for riju
        sima.id=13;
        sima.name="lovely";
        sima.salary=2000;
        // Printing the attributes
//        System.out.println(ayush.id);
//        System.out.println(ayush.name);
        ayush.printDetails();
        int salary = ayush.getSalary();
        System.out.println(salary);
        sima.printDetails();
        int salary1 = sima.getSalary();
        System.out.println(salary1);


    }
}
