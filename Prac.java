//public class Prac {
//    public static void main(String[] args) {
//        int num1 = 20;
//        int num2 = 30;
//        int sum = num1 + num2;
//        System.out.println(sum);
//    }
//
//}


//import java.util.Scanner;
//
//public class Prac {
//    public static void main(String[] args) {
//        int num1;
//        int num2;
//        int sum;
//
//        Scanner ss = new Scanner(System.in);
//        System.out.println("Enter First  Number: ");
//        num1 = ss.nextInt();
//        System.out.println("Enter Second Number: ");
//        num2 = ss.nextInt();
//
//        ss.close();
//
//        sum = num1 + num2;
//        System.out.println("Sum of the Numbers: " + sum);
//    }
//
//}



//public class Prac {
//    public static void main(String[] args) {
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//
//}





//public class Prac {
//    public static void main(String[] args) {
//
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//
//}




public class Prac {
    public static void main(String[] args) {

        int row = 5;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}