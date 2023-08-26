public class Lecture80 {
    public static void main(String[] args) {
        // Throws Arithmetic Exception error
        // With try and catch block
        int a = 600;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("We failed to execute");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
