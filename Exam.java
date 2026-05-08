//Array************
//------------------------------



//public class Exam {
//    public static void main(String[] args) {
//
//        int[][] a = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
//        int[][] b = {{1, 3, 4}, {2, 4, 3}, {1, 2, 4}};
//
//        int[][] c = new int[3][3];
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                c[i][j] = a[i][j] + b[i][j];
//                System.out.print(c[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//}






//public class Exam {
//    public static void main(String[] args) {
//        double[] myList = {1.9, 2.9, 4.5, 3.4, 3.5};
//
//        //print all the array elements
//        for (int i = 0; i < myList.length; i++) {
//            System.out.println(myList[i] + " ");
//        }
//
//        //summing all elements
//        double total = 0;
//        for (int i = 0; i < myList.length; i++) {
//            total += myList[i];
//        }
//        System.out.println("Total is : " + total);
//
//        //Finding the largest element
//        double max = myList[0];
//        for (int i = 1; i < myList.length; i++) {
//            if (myList[i] > max) {
//                max = myList[i];
//            }
//        }
//        System.out.println("Max is " + max);
//
//    }
//
//}





//public class Exam {
//    public static void main(String[] args) {
//        double[] myList = {1.9, 2.9, 3.4, 3.5};
//
//        //print all the array elements
//        for (double array : myList) {
//            System.out.println(array);
//        }
//    }
//
//}





//public class Exam {
//    public static void main(String[] args) {
//
//        //define the dimensions of the matrix
//        int rows = 3;
//        int cols = 3;
//
//        //Create a 2-dimensions of array(matrix)
//        int[][] matrix = new int[rows][cols];
//
//        //Populate the matrix with some values
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                matrix[i][j] = i + j; //Just an example, you can set any values here
//            }
//        }
//
//        //Display the matrix
//        System.out.println("Matrix:");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++){
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
//    }
//
//}




//import java.util.*;
//public class Exam {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 10 array elements: ");
//
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Array: ");
//
//        for (int j = 0; j < arr.length; j++) {
//            System.out.println(arr[j]);
//        }
//    }
//
//}


