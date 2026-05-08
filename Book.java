//Java Operator ***************** Chapter -3
// ------------------------------------------------------------




//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number- 1: ");
//        int a = sc.nextInt();
//
//        System.out.println("Enter the number- 2: ");
//        int b = sc.nextInt();
//
//        int add = a + b;
//        System.out.println("The ans is :" + add);
//    }
//
//}


//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        int a = input.nextInt();
//
//        System.out.println("Enter the second number: ");
//        int b = input.nextInt();
//
//        int sub = a - b;
//        System.out.println("The ans of substraction is : " + sub);
//    }
//
//}


//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//        int a;
//        int b;
//        int mul;
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        a = in.nextInt();
//
//        System.out.println("Enter the second number: ");
//        b = in.nextInt();
//
//        mul = a * b;
//        System.out.println("The ans mul: " + mul);
//    }
//
//}


//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the first number: " );
//        int a = in.nextInt();
//
//        System.out.println("Enter the first number: ");
//        int b = in.nextInt();
//
//        int div = a / b;
//        System.out.println("The ans is " + div);
//    }
//
//}


//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("The first number: ");
//        double a = sc.nextDouble();
//
//        System.out.println("The second number: ");
//        double b = sc.nextDouble();
//
//        System.out.println("The third number: ");
//        double c = sc.nextDouble();
//
//
//        double average = (a + b + c) / 3;
//
//        System.out.println("Avarage area is "  + average);
//    }
//
//}


//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//        int length;
//        int width;
//        int area;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the length: ");
//        length = sc.nextInt();
//
//        System.out.println("Enter the width: ");
//        width = sc.nextInt();
//
//        area = length * width;
//
//        System.out.println("Rectangle area is " + area);
//    }
//
//}


//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the diagonal -p: ");
//        double p= sc.nextDouble();
//
//        System.out.println("Enter the diagonal -q: ");
//        double q= sc.nextDouble();
//
//        double area = (0.5*(p * q));
//        System.out.println("Rhombus area is " + area);
//    }
//
//}


//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length: ");
//        int a = sc.nextInt();
//
//        int area = a * a;
//        System.out.println("Square area is  " + area);
//    }
//
//}


//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Day : -");
//        int day = sc.nextInt();
//
//        int month = day/30;
//        int newDay = day - (month * 30);
//
//        System.out.println(day + " day is equal to " + month + " month and " + newDay + " days");
//
//    }
//
//}


//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the day :- ");
//        int month = sc.nextInt();;
//
//        int day = month * 30;
//        System.out.println(month + " month is equal to  " + day + " days ");
//    }
//
//}


//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter hour : ");
//        int hour = sc.nextInt();
//
//        int minute = hour * 60;
//        System.out.println(hour + " hour is equal to " + minute + " minutes ");
//    }
//
//}


//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter minute: ");
//        int minute = sc.nextInt();
//
//        int hour = minute/60;
//        int newminute = minute - (hour*60);
//        System.out.println(minute + " minure is equal to " + hour + " Hour " + newminute + " minute");
//
//    }
//
//}


//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter hour: ");
//        int hour = sc.nextInt();
//
//        int minute = hour * 60;
//        int second = minute * 60;
//
//        System.out.println(hour + " hour is equal to " + second + " second");
//
//    }
//
//}


//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter second: ");
//        int second = sc.nextInt();
//
//        int minute = second / 60;
//        int hour = minute / 60;
//
//        int newsecond = second - (minute * 60);
//        int newminute = minute - (hour * 60);
//
//        System.out.println(second + " second is equal to " + hour + " hour " + newminute + " minute and " + newsecond + " second");
//
//
//    }
//
//}


//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the temperature in Celsius: ");
//        double celsius = sc.nextDouble();
//
//        double fahrenheit = ((9 * celsius) / 5) + 32;
//
//        System.out.println("Temperature in Fahrenheit " + fahrenheit);
//    }
//
//}


//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Fahrenheit: ");
//        double fahrenheit = sc.nextDouble();
//
//        double celsius = ((fahrenheit - 32) * 5) / 9;
//
//        System.out.println("Temperature in Celsius: " + celsius);
//    }
//
//}







//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number a:-");
//        int a = sc.nextInt();
//
//        System.out.println("Enter the number b:-");
//        int b = sc.nextInt();
//
//        int temp = a;
//
//        a = b;
//        b = temp;
//
//        System.out.println("After swapping: ");
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//    }
//
//}




//public class Book {
//    public static void main(String[] args) {
//        int x = 454;
//        int y = x % 10;
//        System.out.println(y);
//    }
//
//}






//Java Control Statement*************** Chapter - 4
//---------------------------------------------------------------------------





//import java.util.Scanner;
//public class Book {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number a: ");
//        int a = sc.nextInt();
//
//        System.out.println("Enter the number b: ");
//        int b = sc.nextInt();
//
//        if (a > b) {
//            System.out.println("a is big");
//        }
//
//        else {
//            System.out.println("b is big");
//        }
//    }
//
//}


//import java.util.Scanner;
//public class Book {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number a: ");
//        int a = sc.nextInt();
//
//        System.out.println("Enter the number b: ");
//        int b = sc.nextInt();
//
//        if (a < b) {
//            System.out.println("a is smaller");
//        }
//
//        else {
//            System.out.println("b is smaller");
//        }
//    }
//
//}





//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number a: ");
//        int a = sc.nextInt();
//
//        System.out.println("Enter the number b: ");
//        int b = sc.nextInt();
//
//        System.out.println("Enter the number c: ");
//        int c = sc.nextInt();
//
//        if ((a > b) && (a > c)) {
//            System.out.println("a is biggest");
//        }
//
//        else if ((b > a) && (b > c)) {
//            System.out.println("b is biggest");
//        }
//
//        else {
//            System.out.println("c is biggest");
//        }
//    }
//
//}







//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your mark: ");
//        int mark = sc.nextInt();
//
//        if (mark >= 36 && mark <= 100) {
//            System.out.println("pass");
//        }
//
//        else if (mark > 100) {
//            System.out.println("Wrong input");
//        }
//
//        else {
//            System.out.println("fail");
//        }
//    }
//
//}


//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int num = sc.nextInt();
//
//        if (num > 0) {
//            System.out.println("Number is positive");
//        }
//
//        else if (num == 0 ) {
//            System.out.println("The number is neutral");
//        }
//
//        else {
//            System.out.println("Number is negative");
//        }
//    }
//
//}


//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int number = sc.nextInt();
//
//        if (number % 2 == 0) {
//            System.out.println("Number is Even");
//        }
//
//        else {
//            System.out.println("Number is odd");
//        }
//    }
//
//}


//import java.util.Scanner;
//
//public  class Book {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your year:- ");
//        int year = sc.nextInt();
//
//        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//            System.out.println("This is leap year");
//        }
//
//        else {
//            System.out.println("This is not a leap year");
//        }
//    }
//
//}


//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number a:- ");
//        int a = sc.nextInt();
//
//        System.out.println("Enter the number b:- ");
//        int b = sc.nextInt();
//
//        System.out.println("Enter the number c:- ");
//        int c = sc.nextInt();
//
//
//        if (((a + b) > c) && ((b + c) > c) && ((c + a) > b)) {
//            int s = (a + b + c) / 2;
//            double area = Math.sqrt(s*(s -a)*(s - b) * (s - c));
//
//            System.out.println("The triangle is " + area);
//        }
//
//        else {
//            System.out.println("The triangle is not possible1");
//        }
//    }
//
//}


//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number a:-");
//        int a = sc.nextInt();
//
//        System.out.println("Enter the second number b:- ");
//        int b = sc.nextInt();
//
//        System.out.println("Enter the third number c:- ");
//        int c = sc.nextInt();
//
//
//        if (a > b && a > c) {
//            System.out.println("a is Big");
//        }
//
//        else if (b > a && b > c) {
//            System.out.println("b is Big");
//        }
//
//        else {
//            System.out.println("c is Big");
//        }
//    }
//
//}


//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("a");
//        int a = sc.nextInt();
//
//        System.out.println("b");
//        int b = sc.nextInt();
//
//        System.out.println("c");
//        int c = sc.nextInt();
//
//
//        if (a > b){
//            if (a > c) {
//                System.out.println("a big");
//            }
//
//            else {
//                System.out.println("c is big");
//            }
//        }
//
//        else {
//            if (b > c) {
//                System.out.println("b big");
//            }
//            else {
//                System.out.println("c big");
//            }
//        }
//    }
//
//}


//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Student's mark (out of 100): ");
//        int mark = sc.nextInt();
//
//        String grade;
//
//        switch (mark / 10) {
//            case 10:
//            case 9:
//            case 8:
//                grade = "A+";
//                break;
//
//            case 7:
//                grade = "B";
//                break;
//
//            case 6:
//                grade = "C";
//                break;
//
//            case 5:
//                grade = "D";
//                break;
//
//            default:
//                grade = "F";
//
//        }
//        System.out.println("The student's grade is: " + grade);
//    }
//}







//import java.util.Scanner;
//
//public class Book {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the month number:- ");
//        int month = sc.nextInt();
//
//        String monthN;
//
//        switch (month) {
//            case 1:
//                monthN = "January";
//                break;
//
//            case 2:
//                monthN = "February";
//                break;
//
//            case 3:
//                monthN = "March";
//                break;
//
//            case 4:
//                monthN = "April";
//                break;
//
//            case 5:
//                monthN = "May";
//                break;
//
//            case 6:
//                monthN = "June";
//                break;
//
//            case 7:
//                monthN = "July";
//                break;
//
//            case 8:
//                monthN = "August";
//                break;
//
//            case 9:
//                monthN = "September";
//                break;
//
//            case 10:
//                monthN = "October";
//                break;
//
//            case 11:
//                monthN = "November";
//                break;
//
//            case 12:
//                monthN = "December";
//                break;
//
//            default:
//                monthN = "Invalid";
//        }
//        System.out.println("The month is " + monthN);
//    }
//
//}


import java.util.Scanner;

public class Book {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("a: -");
        double a = sc.nextDouble();

        System.out.println("b: -");
        double b = sc.nextDouble();

        System.out.println("c: -");
        double c = sc.nextDouble();


        double d = (b * b) - (4 * a * c);

        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("The root are" + r1 + " and " + r2);
        }

        else if (d == 0) {
            double r = (-b / (2 * a));
            System.out.println("The root is " + r);
        }

        else {
            System.out.println("The root isn't possible");
        }
    }

}