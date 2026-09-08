//import java.util.Scanner;
//
//public class QuadraticEquation {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        double a, b, c;
//        double discriminant, root1, root2, realPart, imaginaryPart;
//
//        System.out.print("Enter value of a: ");
//        a = input.nextDouble();
//
//        System.out.print("Enter value of b: ");
//        b = input.nextDouble();
//
//        System.out.print("Enter value of c: ");
//        c = input.nextDouble();
//
//        discriminant = (b * b) - (4 * a * c);
//
//        if (discriminant > 0) {
//            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
//            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
//
//            System.out.println("Two Distinct Real Roots:");
//            System.out.println("Root 1 = " + root1);
//            System.out.println("Root 2 = " + root2);
//
//        }
//        else if (discriminant == 0) {
//            root1 = -b / (2 * a);
//
//            System.out.println("Two Equal Real Roots:");
//            System.out.println("Root = " + root1);
//
//        }
//        else {
//            realPart = -b / (2 * a);
//            imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
//
//            System.out.println("Complex Roots:");
//            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
//            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
//        }
//
//        input.close();
//    }
//}