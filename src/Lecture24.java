public class Lecture24 {
    public static void main(String[] args) {
        // Break Statement
//        for(int i=0;i<5;i++){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//        }
//        System.out.println("Loop ends here");
        // Continue Statement
        for(int i=0;i<5;i++){
            if (i==2){
                System.out.println("End the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }
    }
}
