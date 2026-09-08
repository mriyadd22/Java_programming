//public class TryCatch {
//    public static void main(String[] args) {
//        int[] myArray = {2, 4, 5};
//        System.out.println(myArray[4]); //Error
//    }
//
//}




//public class TryCatch {
//    public static void main(String[] args) {
//        try {
//            int[] numbers = {23, 4, 5, 7, 98, 2};
//            System.out.println(numbers[9]);
//        }
//        catch (Exception e) {
//            System.out.println("Array Index out of Bounds");
//        }
//        finally {
//            System.out.println("Try and Catch is finished");
//        }
//    }
//
//}





// Throws Statement

public class TryCatch {
    void tryCatch(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied! You must be at least 18 years old");
        }
        else {
            System.out.println("access granted");
        }
    }

    public static void main(String[] args) {
        TryCatch tc = new TryCatch();
        tc.tryCatch(21);
    }

}