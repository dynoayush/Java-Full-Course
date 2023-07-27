public class Lecture27 {
    public static void main(String[] args) {
//        String [] students = {"Ha","Ayu","Stu","Flo"};
//        System.out.println(students.length);
//        System.out.println(students[2]);
//        int [] marks ={ 98,89,9,6,8};
//        System.out.println(marks.length);    // length
//        System.out.println("Printing using for loop");    // Displaying the array
//        for(int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }
        int [] marks ={ 98,89,9,6,8};
        System.out.println("Array in reverse order");
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
        System.out.println("Printing using for-each loop");
        for(int element: marks){
            System.out.println(element);
        }
    }
}
