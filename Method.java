//public class Method {
//    public void myMethod(){
//        //Code to be executed
//    }
//}


//public class Method {
//    public static void myMethod(){
//        System.out.println("This is a method");
//    }
//
//    public static void main(String[] args) {
//        myMethod();
//        myMethod();
//        myMethod();
//        myMethod();
//
//    }
//
//}




//public class Method {
//    public static void myMethod(String fname) {
//        System.out.println(fname + " Refsnes");
//    }
//
//    public static void main(String[] args) {
//        myMethod("Liam");
//        myMethod("Rohan");
//        myMethod("Robi");
//    }
//
//}



//public class Method {
//    public static void myMethod(String name) {
//        System.out.println(name);
//    }
//
//    public static void main(String[] args) {
//        myMethod("Riyad");
//    }
//
//}




//public class Method {
//    public static int myMethod(int x) {
//        return x + 1;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(myMethod(3));
//    }
//
//}



//public class Method {
//    public  static int myMethod(int x, int y) {
//        return x +y;
//    }
//
//    public static void main(String[] args) {
//        int vari = myMethod(3, 5);
//        System.out.println(vari);
//    }
//
//}




//public class Method {
//    static int myMethod(int x) {
//        return x * 2;
//    }
//
//    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++){
//            System.out.println("double of " + i + " is " + myMethod(i));
//        }
//    }
//
//}








    /* Method Overloading */

//public class Method {
//    static int plusMethod(int x, int y){
//        return x + y;
//    }
//
//    static double plusMethod(double x, double y){
//        return x + y;
//    }
//
//    public static void main(String[] args) {
//        int methodInt = plusMethod(3, 7);
//        double methodDouble = plusMethod(5.3, 6.7);
//
//        System.out.println(methodInt);
//        System.out.println(methodDouble);
//
//    }
//
//}



//public class Method {
//    public static void checkNumber(int number){
//        if (number > 0){
//            System.out.println("The number is positive");
//        }
//        else if (number < 0) {
//            System.out.println("The number is negative");
//        }
//        else {
//            System.out.println("it Zero");
//        }
//    }
//
//    public static void main(String[] args) {
//        checkNumber(3);
//        checkNumber(-4);
//        checkNumber(0);
//    }
//
//}



//Method overloading
//public class Method {
//    static int add(int a, int b) {
//        return a + b;
//    }
//
//    static int add(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    static double add(double a, double b) {
//        return a + b;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Sum of two integers: " + add(10, 20));
//        System.out.println("Sum of three integers: " + add(10, 20, 30));
//        System.out.println("Sum of two doubles: " + add(10.5, 20.5));
//    }
//}
//Name: Riyad Bepari
//Roll: 842103



















//java Date and Time**************

//import java.time.LocalDate;
//
//class Method{
//    public static void main(String[] args) {
//        LocalDate date = LocalDate.now();
//        System.out.println("Data: " + date);
//    }
//
//}



//import java.time.LocalTime;
//
//public class Method {
//    public static void main(String[] args) {
//        LocalTime time = LocalTime.now();
//        System.out.println("Time: " + time);
//    }
//
//}



//import java.time.LocalDateTime;
//
//public class Method {
//    public static void main(String[] args) {
//        LocalDateTime dt = LocalDateTime.now();
//        System.out.println("Date and Time: " + dt);
//    }
//
//}



