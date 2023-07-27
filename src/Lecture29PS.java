public class Lecture29PS {
    public static void main(String[] args) {
//        // Question 1
//        float[] marks= {6.5f,7.8f,6.7f,9.9f,2.5f};
//        float sum=0;
//        for(float element:marks) {
//            sum = sum + element;
//        }
//        System.out.println(sum);
        // Question 2
//        float[] marks= {6.5f,7.8f,6.7f,9.9f,2.5f};
//        float num= 8.5f;
//        boolean isInArray = false;
//        for(float element:marks) {
//            if(num==element){
//                isInArray = true;
//                break;
//            }
//        }
//        if(isInArray){
//            System.out.println("The value present in the array");
//        }
//        else {
//            System.out.println("The value is not present in the array");
//        }
        //Question 3
//        float[] marks= {6.5f,7.8f,6.7f,9.9f,2.5f};
//        float sum=0;
//        for(float element:marks) {
//            sum = sum + element;
//        }
//        System.out.println(sum/marks.length);
        // Question 4
//        int [][] mat1={{1,2,3},
//                      {4,5,6}};
//        int [][] mat2={{2,6,13},
//                       {3,7,1}};
//        int [][] result ={{0,0,0},
//                          {0,0,0}};
//        for (int i=0;i< mat1.length;i++) {         // rows
//            for (int j = 0; j < mat1[i].length; j++) {            // columns
//                System.out.format("Setting value for i=%d and j=%d\n" , i,j);
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//            for (int i=0;i< mat1.length;i++){          // printing the elements of a 2d array
//            for (int j=0;j<mat1[i].length;j++){
//                System.out.print(result[i][j] + " ");
//                result[i][j]= mat1[i][j]+mat2[i][j];
//            }
//            System.out.println(" ");                   // helps to print a new line
//        }
        // Question 5
//        int [] arr = {1,2,3,4,5,6};
//        int l = arr.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//        for(int i=0;i<n;i++){
//            temp=arr[i];               // swapping the values of the array
//            arr[i]=arr[l-1-i];
//            arr[l-1-i]=temp;
//        }
//        for(int element:arr){
//            System.out.println(element);
//        }
        // Question 6
//        int [] marks= {1,2,3,4,5,6};
//        int max =0;
//        for(int element:marks){
//            if(element>max){
//                max=element;
//            }
//        }
//        System.out.println(max);
        // Question 7
//        int [] marks= {1,2,3,4,5,6};
//        int min =Integer.MAX_VALUE;
//        for(int element:marks){
//            if(element<min){
//                min=element;
//            }
//        }
//        System.out.println(min);
        // Question 8
        boolean isSorted = true;
        int [] marks= {1,2,3,4,5,6};
        for (int i=0;i<marks.length-1;i++){
            if (marks[i]>marks[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted)
            System.out.println("The array is sorted ");
        else{
            System.out.println("The array is not sorted ");
        }






    }
}
