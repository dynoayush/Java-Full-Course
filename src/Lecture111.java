import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Lecture111 {
    public static void main(String[] args) {
        // Creating a new file
//        File myFile = new File("CWH_file1.txt");
//                try {
//                    myFile.createNewFile();
//                    System.out.println("File created successfully.");
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
         // Writing to a file
//        File myFile = new File("CWH_file1.txt");
//                try {
//                    FileWriter fileWriter = new FileWriter("CWH_file1.txt");
//                    fileWriter.write("CodeWithHarry is one step solution for your all programming problems.\nKeep learning, Keep coding!");
//                    fileWriter.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
        // Reading a file
//        File myFile = new File("CWH_file1.txt");
//        try {
//            Scanner sc = new Scanner(myFile);
//            while(sc.hasNextLine()){
//                String line = sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        // Deleting a file
        File myFile = new File("CWH_file1.txt");
        if(myFile.delete()){
            System.out.println("I have deleted: " + myFile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }
    }

        }

