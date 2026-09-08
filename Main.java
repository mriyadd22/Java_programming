//String Concatenation***

//public class Main {
//    public static void main(String[] args) {
//        String firstName = "Riyad";
//        String lastName = "Bepari";
//        System.out.println(firstName + " " + lastName);
//    }
//
//}



//Concatenation in sentences

//public class Main {
//    public static void main(String[] args) {
//        String name = "Riyad";
//        int age = 18;
//        System.out.println("My name is " + name + " and I am " + age );
//    }
//
//}


//The concat() Method***

//public class Main {
//    public static void main(String[] args) {
//        String firstName = "Riyad ";
//        String lastName = "Bepari";
//
//        String a = "java ";
//        String b = "is ";
//        String c = "fun!";
//        System.out.println(firstName.concat(lastName));
//        System.out.println(a.concat(b).concat(c));
//    }
//
//}



//public class Main {
//    public static void main(String[] args) {
//        int x = 10;
//        int y = 20;
//        int z = x + y;
//
//        String a = "10";
//        String b = "20";
//
//        String n = "10";
//        int m = 20;
//        System.out.println(n + m);
//        System.out.println(a + b);
//        System.out.println(z);
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        String txt = "We are the so-called \'vikings\' from the north,";
//        String txt2 = "We are the so-called \"vikings\" from the north.";
//        String txt3 = "We are the so-called \f vikings from the north.";
//
//        System.out.println(txt3);
//
//        System.out.println(txt);
//        System.out.println(txt2);
//
//    }
//
//}



//public class Main {
//    public static void main(String[] args) {
//        System.out.println(Math.random() * 101);
//    }
//
//}








//Java Condition*************
//-------------------------------------




//public class Main {
//    public static void main(String[] args) {
//        int myAge = 25;
//        int votingAge = 18;
//        if (myAge >= votingAge) {
//            System.out.println("Old enough to vote!");
//        } else {
//            System.out.println("Not old enough to vote.");
//        }
//    }

//}


//public class Main {
//    public static void main(String[] args) {
//        boolean isRaining = true;
//        if (isRaining) {
//            System.out.println("Bring an umbrella!");
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        if (20 > 18) {
//            System.out.println("20 is greater than 18");
//        }
//    }
//
//}

//public class Main {
//    public static void main(String[] args) {
//      boolean isLightOn = true;
//      if (isLightOn) {
//          System.out.println("The light is on.");
//      }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        boolean isLightOn = false;
//        if (isLightOn) {
//            System.out.println("The light is on.");
//        }
//        System.out.println("This line always runs.");
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int x = 20;
//        int y = 18;
//        if (x > y)
//            System.out.println("x is greater than y");
//            System.out.println("This line runs no matter what \"not part of the if statement\"");
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int x = 20;
//        int y = 18;
//
//        if (x > y) {
//            System.out.println("x is greater than y");
//            System.out.println("Both lines are part of ThE if");
//        }
//
//        System.out.println("I am outside if, \" not part of if \"");
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int time = 20;
//        String result = (time < 18) ? "Good day.": "Good evening";
//        System.out.println(result);
//    }
//
//}



//public class Main {
//    public static void main(String[] args) {
//        int x = 20;
//        int y = 25;
//
//        if (x > 10) {
//            System.out.println("x is greater than 10");
//
//            // Nested if
//            if(y > 25) {
//                System.out.println("y is also greater than 20");
//            }
//        }
//    }
//
//}




//public class Main {
//    public static void main(String[] args) {
//        int age = 20;
//        boolean isCitizen = true;
//
//        if (age >= 18) {
//            System.out.println("Old enough to vote.");
//
//            if (isCitizen) {
//                System.out.println("And you are a citizen, so you can vote!");
//            }
//            else {
//                System.out.println("NOt old enough to vote.");
//            }
//        }
//    }
//
//}



//public class Main {
//    public static void main(String[] args) {
//        int a = 200;
//        int b = 33;
//        int c = 500;
//
//        if (a > b && c > a) {
//            System.out.println("Both conditions are true");
//        }
//        else {
//            System.out.println("One condition is false.");
//        }
//    }
//
//}



//public class Main {
//    public static void main(String[] args) {
//        int a = 200;
//        int b = 33;
//        int c = 500;
//
//        if (a > b || b > c) {
//            System.out.println("At least one condition is true.");
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int a = 33;
//        int b = 200;
//
//        if (!(a > b)) {
//            System.out.println("a is NOT greater than b");
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        boolean isLoggedIn = true;
//        boolean isAdmin = false;
//        int securityLevel = 3;  // 1 = highest
//
//        if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
//            System.out.println("Access granted");
//        }
//        else {
//            System.out.println("Access denied");
//        }
//    }
//
//}

//public class Main {
//    public static void main(String[] args) {
//        int doorCode = 1337;
//        if (doorCode == 1337) {
//            System.out.println("Correct code. The door is ");
//        }
//        else {
//            System.out.println("Wrong code. The door remains.");
//        }
//    }
//
//}



//public class Main {
//    public static void main(String[] args) {
//        int myNum = 10;
//
//        if (myNum > 0) {
//            System.out.println("The value is a positive number.");
//        }
//        else if (myNum < 0) {
//            System.out.println("The value is a negative number.");
//        }
//        else {
//            System.out.println("The value is Zero.");
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int myAge = 25;
//        int votingAge = 18;
//
//        if (myAge >= votingAge) {
//            System.out.println("Old enough to vore!");
//        }
//        else {
//            System.out.println("Not old enough to vote.");
//        }
//    }
//
//}



//public class Main {
//    public static void main(String[] args) {
//        int age = 20;
//        boolean isCitizen = true;
//
//        if (age >= 18){
//            System.out.println("Old enough to vote");
//            if (isCitizen){
//                System.out.println("And you are citizen, so you can vore!");
//            }
//            else {
//                System.out.println("But you must be a citizen to vote.");
//            }
//        }
//        else {
//            System.out.println("Not old enough to vote.");
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int myNumber = 5;
//
//        if (myNumber % 2 == 0) {
//            System.out.println(myNumber + " is even.");
//        }
//        else {
//            System.out.println(myNumber + " is odd.");
//        }
//    }
//
//}



//public class Main {
//    public static void main(String[] args) {
//        int temperature = 30;
//
//        if (temperature < 0){
//            System.out.println("It's freezing!");
//        }
//        else if (temperature < 20) {
//            System.out.println("It's cool.");
//        }
//        else {
//            System.out.println("It's warm.");
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        boolean isLoggedIn = true;
//        boolean isAdmin = false;
//        int securityLevel = 3;
//
//        if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
//            System.out.println("Access granted");
//        }
//        else {
//            System.out.println("Access denied");
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int day = 4;
//
//        switch (day) {
//            case 1:
//                System.out.println("saturday");
//                break;
//
//            case 2:
//                System.out.println("sunday");
//                break;
//
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int day = 4;
//
//        switch (day) {
//            case 6:
//                System.out.println("Today is Saturday!");
//                break;
//
//            case 7:
//                System.out.println("Today is sunday.");
//                break;
//
//            default:
//                System.out.println("Looking forward to the weekend.");
//        }
//    }
//
//}






// Java loop*********
//------------------------------





//while (condition) {
//    //Code block to be executed
//}

//public class Main {
//    public static void main(String[] args) {
//        int i = 0;
//
//        while (i < 5) {
//            System.out.println("java");
//            i ++;
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int countDown = 5;
//
//        while (countDown > 0) {
//            System.out.println(countDown);
//            countDown--;
//        }
//        System.out.println("Happy New Year!!");
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int num = 4;
//
//        while (num > 0) {
//            System.out.println(num);
//            num--;
//        }
//        System.out.println("Riyad");
//    }
//
//}



//public class Main {
//    public static void main(String[] args) {
//        int i = 10;
//
//        while (i < 5) {
//            System.out.println("This will never be printed");
//            i++;
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int i = 0;
//        do {
//            System.out.println("Bangladesh " + (i + 1));
//            i++;
//        }
//        while (i < 5);
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//        }
//        while (i >= 3);
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int countDown = 3;
//        while (countDown > 0) {
//            System.out.println(countDown);
//            countDown--;
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int dice = 1;
//        while (dice <= 6) {
//            if (dice <= 4) {
//                System.out.println("Not Yatzy");
//            }
//            else {
//                System.out.println("Yatzy!");
//            }
//            dice++;
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int name = 7;
//        while (name > 0) {
//            if (name >= 5) {
//                System.out.println("not found!");
//            }
//            else {
//                System.out.println("Riyad");
//            }
//            name = name - 1;
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//
//        int sum = 0;
//        for (int i = 1; i <= 5; i++) {
//            sum = sum + i;
//        }
//        System.out.println("Sum is " + sum);
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        for (int i = 5; i > 0; i--) {
//            System.out.println(i);
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        for (int j = 1; j <= 3; j++) {
//            for (int i = 1; i <= 3; i++) {
//                System.out.print(j * i + " ");
//            }
//            System.out.println();
//        }
//    }
//
//}

//public class Main {
//    public static void main(String[] args) {
//        String [] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        for (String car : cars) {
//            System.out.println(car);
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int[] numbers = {20, 30, 60, 50};
//        for (int num : numbers) {
//            System.out.println(num);
//        }
//    }
//
//}

//public class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//
//        for (int i = 5; i >= 1; i--){
//            for (int j = 1; j <= i; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int rows = 5;
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= rows - i; j++ ) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//        for (int i = 1; i <= rows - 1; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= rows - i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}



//public class Main {
//    public static void main(String[] args) {
//        int num;
//        num = 10;
//
//        for (int i = 1; i <= num; i += 1 + 1){
//            System.out.println(i);
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int num;
//        num = 2;
//
//        for (int i = 1; i <= 10; i++){
//            System.out.println(num + "x" + i + " = " + (num * i));
//        }
//    }
//
//}



//public class Main {
//    public static void main(String[] args) {
//        int num;
//        num = 9;
//
//        for (int i = 1; i <= 10; i++){
//            System.out.println(num + " x " + i + " = " + (num * i));
//        }
//    }
//
//}



//public class Main {
//    public static void main(String[] args) {
//        int n = 5;
//        int fact = 1;
//
//        for (int i = 1; i <= n; i++) {
//            fact *= i;
//        }
//        System.out.println("factorial of " + n + " is " + fact);
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        for (int seat = 1; seat <= 5; seat++){
//            System.out.println("seat num: " + seat);
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i++) {
//            if (i == 4) {
//                continue;
//            }
//            System.out.println(i);
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < 6; i++) {
//            if (i == 2) {
//                continue;
//            }
//            if (i == 4) {
//                break;
//            }
//            System.out.println(i);
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//
//            if (i == 4) {
//                break;
//            }
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int i = 0;
//        while (i < 10) {
//            if (i == 4){
//                i++;
//                continue;
//            }
//            System.out.println(i);
//            i++;
//        }
//    }
//
//}

//public class Main {
//    public static void main(String[] args) {
//        int[] numbers = {3, -1, 7, 0, 9};
//
//        for (int n: numbers ){
//            if (n < 0){
//                continue;  //Skip negative numbers
//            }
//            if (n == 0){
//                break; //Stop loop when zero is found
//            }
//            System.out.println(n);
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int[] numbers = {3, 5, 1, 6,7, 9, 4};
//
//        for (int n: numbers) {
//            if (n < 3) {
//                continue; //Less than 3 always be skIp
//            }
//            if (n == 9) {
//                break;
//            }
//            System.out.println(n);
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        System.out.println(cars.length);
//
//    }
//
//}

//public class Main {
//    public static void main(String[] args) {
//        String[] cars = new String[5];
//        cars[0] = "Volvo";
//        cars[1] = "BMW";
//        cars[2] = "Mazda";
//        System.out.println(cars[0                                                                                        ]);
//    }
//
//}



//public class Main {
//    public static void main(String[] args) {
//        int rows = 5;
//        int i = 1;
//
//        // উপরের অংশ
//        while (i <= rows) {
//            int j = 1;
//            while (j <= rows - i) {
//                System.out.print(" ");
//                j++;
//            }
//            int k = 1;
//            while (k <= i) {
//                System.out.print("* ");
//                k++;
//            }
//            System.out.println();
//            i++;
//        }
//
//        // নিচের অংশ
//        i = rows - 1; // এখানে ভুলটা ঠিক করা হয়েছে (i আবার সেট করা দরকার)
//        while (i >= 1) {
//            int j = 1;
//            while (j <= rows - i) {
//                System.out.print(" ");
//                j++;
//            }
//            int k = 1;
//            while (k <= i) {
//                System.out.print("* ");
//                k++;
//            }
//            System.out.println();
//            i--;
//        }
//    }
//}



//public class Main {
//    public static void main(String[] args) {
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//
//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i]);
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int[] num = {10, 20, 30, 40};
//
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(num[i]);
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int[] numbers = {1, 5, 10, 25};
//        int sum = 0;
//
//        for(int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
//        System.out.println(sum);
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        String[] cars = {"Volvo", "BMW", "ford", "Mazda"};
//
//        for (String car : cars){
//            System.out.println(car);
//        }
//    }
//
//}

//public class Main {
//    public static void main(String[] args) {
//        String[] seats = {"Jenny", "Liam", "Angle", "Bo"};
//
//        for (int i = 0; i < seats.length; i++) {
//            System.out.println("Seat number " + i + " is taken by " + seats[i]);
//        }
//    }
//
//}



//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] numbers = new int[5];
//        numbers[2] = 5;
//        numbers[3] = 6;
//        numbers[4] = 4;
//        numbers[0] = 7;
//        numbers[1] = 2;
//
//        Arrays.sort(numbers);
//
//        System.out.println(Arrays.toString(numbers));
//    }
//
//}

//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i++) {
//            System.out.print(i + " ");
//        }
//    }
//
//}

//public class Main {
//    public static void main(String[] args) {
//        String[] names = {"Sweta", "Gudly", "Amiya"};
//
//        for (String name : names) {
//            System.out.println("Name: " + name);
//        }
//    }
//
//}

//public class Main {
//    public static void main(String[] args) {
//        int i = 0;
//        while (i <= 10) {
//            System.out.print(i + " ");
//            i++;
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int i = 0;
//        do {
//            System.out.print(i + " " );
//            i++;
//        }
//        while (i <= 10);
//    }
//
//}

//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("This loop will run forever.");
//        }
//    }
//
//}

//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i + " ");
//        }
//    }
//
//}

//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            if (i == 2) {
//                continue;
//            }
//            System.out.println(i);
//        }
//    }
//
//}

// Java program to demonstrates Empty loop body
//import java.io.*;
//
//class Geeks {
//    public static void main(String[] args)
//    {
//        for (int i = 0; i < 10; i++) {
//
//            // Empty body no operations
//        }
//    }
//}



//public class Main {
//    public static void main(String[] args) {
//        double sum = 0;
//        for (int i = 1; i <= 20; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 5; j++){
//                System.out.print("(" + i + "." + j + ")  ");
//            }
//            System.out.println();
//        }
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i >= 1; i++) {
//            System.out.println("infinite loop: " + i);
//        }
//    }
//
//}


//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] array = new int[4];
//        array[0] = 5;
//
//        System.out.println(Arrays.toString(array));
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int x = 5;
//        if (x > 2) {
//            if (x > 4) {
//                System.out.println("A");
//            }
//            else {
//                System.out.println("B");
//            }
//        }
//    }
//
//}



//public class Book {
//    static void myMethod() {
//        System.out.println("I just got executed!");
//    }
//
//    public static void main(String[] args) {
//        myMethod();
//
//
//    }
//
//}


//public class Book {
//    static void myMethod(String fname){
//        System.out.println(fname + " Refsnes");
//    }
//    public static void main(String[] args) {
//       myMethod("Liam");
//       myMethod("Jenny");
//       myMethod("Anja");
//    }
//
//}


//public class Book {
//    static void myMethod(String fname, int age) {
//        System.out.println(fname + " is " + age);
//    }
//
//    public static void main(String[] args) {
//        myMethod("Liam", 5);
//        myMethod("Jenny", 8);
//        myMethod("Anja", 31);
//    }
//
//}


//public class Main {
//    static void myMethod(String fname) {
//        System.out.println(fname + " is good guy");
//    }
//
//    public static void main(String[] args) {
//        myMethod("Riyad");
//        myMethod("Shadin");
//        myMethod("Rubel");
//    }
//
//}



//public class Main {
//    static void myMethod(String fname, int age) {
//        System.out.println(fname + " is "+ age);
//    }
//
//    public static void main(String[] args) {
//        myMethod("Liam", 5);
//        myMethod("Jenny", 8);
//        myMethod("Anja", 31);
//    }
//
//}


//public class Main {
//    //
//    static void checkAge(int age) {
//        if (age < 18) {
//            System.out.println("Access denied You are not old enough!");
//        }
//        else {
//            System.out.println("Access granted - You are old enough!");
//        }
//    }
//
//    public static void main(String[] args) {
//        checkAge(16);
//    }
//
//}



//public class Main {
//    static int myMethod(int x) {
//        return 5 + x;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(myMethod(5));
//    }
//}



//public class Main {
//    static int myMethod(int x, int y) {
//        return x + y;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(myMethod(5, 8));
//    }
//
//}



//public class Main {
//    static int myMethod(int x, int y ) {
//        return x + y;
//    }
//
//    public static void main(String[] args) {
//        int store = myMethod(5, 3);
//        System.out.println(store);
//    }
//
//}


//public class Main {
//    // Method that doubles the  number
//    static int doubleGame(int x) {
//        return x * 2;
//    }
//
//    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Double of " + i + " is " + doubleGame(i));
//        }
//    }
//
//}


//public class Main {
//    static void myMethod() {
//        System.out.println("hi");
//    }
//
//    public static void main(String[] args) {
//        myMethod();
//    }
//
//}



//public class Main {
//    static int myMethod() {
//        return 5 + 5;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(myMethod());
//    }
//
//}


//public class Main {
//    static int myMethod(int a, int b) {
//        return a + b;
//    }
//
//    public static void main(String[] args) {
//        int c;
//        c = myMethod(2, 3);
//        System.out.println(c);
//    }
//
//}

//public class Main {
//    static int myMethod(int x) {
//        return x * 2;
//    }
//
//    public static void main(String[] args) {
//        for (int i = 1; i <=5; i++) {
//            System.out.println("Double of " + i + " is " + myMethod(i));
//        }
//    }
//
//}



//multiple methods can have the same name with different  parameters

//public class Main {
//    static int plusMethodInt(int x, int y) {
//        return x + y;
//    }
//    static double plusMethodDouble(double x, double y) {
//        return x + y;
//    }
//
//    public static void main(String[] args) {
//        int myNum1 = plusMethodInt(8, 5);
//        double myNum2 = plusMethodDouble(4.3, 6.26);
//
//        System.out.println(myNum1);
//        System.out.println(myNum2);
//    }
//}



//public class Main {
//    static int myMethod(int x, int y) {
//        return x + y;
//    }
//    static double myMethod(double x , double y) {
//        return x + y;
//    }
//
//    public static void main(String[] args) {
//        int myNum1 = myMethod(8, 5);
//        double myNum2 = myMethod(4.3, 6.26);
//
//        System.out.println("int: " + myNum1);
//        System.out.println("double: " + myNum2);
//    }
//
//}




//public class Main {
//    static int plusMethod(int x, int y) {
//        return x + y;
//    }
//
//    static double plusMethod(double x, double y) {
//        return x + y;
//    }
//
//    public static void main(String[] args) {
//        int myNum1 = plusMethod(3, 5);
//        double myNum2 = plusMethod(3, 2);
//        System.out.println(myNum1);
//        System.out.println(myNum2);
//    }
//
//
//}



//public class Main {
//    public static void main(String[] args) {
//        int x = 100;
//        System.out.println(x);
//    }
//
//}


//public class Main{
//    public static void main(String[]args) {
//        //Code here CANNOT use X
//
//        //{  This is a block
//
//        //Code here CANNOT use x
//
//        int x = 100;
//
//        //Code here CAN use X
//
//        System.out.println(x);
//
//        // } The block ends herE
//
//        //Code here CANNOT use X
//
//
//    }
//}



//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);  // i is accessible here
//        }
//
//        //i, is not accessible here
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Loop 1: " + i);
//        }
//        for (int i = 0; i < 2; i++) {
//            System.out.println("Loop 2: " + i);
//        }
//    }
//
//}


//public class Main {
//    int x = 5;
//
//    public static void main(String[] args) {
//        Main myObj = new Main();
//        System.out.println(myObj.x);
//    }
//
//}



//public class Main {
//    public static void main(String[] args) {
//        int x = 20;
//
//        {
//            int y = 10;
//            System.out.println(x + y); // Ok
//        }
//        System.out.println(y); //Error if you try this
//    }
//
//}




        //Recursion***

//public class Main {
//    static int sum(int k) {
//        if (k > 0) {
//            return k + sum(k - 1);
//        }
//        else {
//            return 0;
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(sum(10));
//    }
//}



//public class Main {
//    public static int sum(int start, int end) {
//        if (end > start) {
//            return end + sum(start, end - 1);
//        }
//        else {
//            return end;
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(sum(5, 10));
//    }
//
//}


//public class Main {
//    static void countdown(int n) {
//        if (n > 0) {
//            System.out.println(n + " ");
//            countdown(n - 1);
//        }
//    }
//
//    public static void main(String[] args) {
//        countdown(5);
//    }
//
//}


//public class Main {
//    static int factorial(int n) {
//        if (n > 1 ) {
//            return n * factorial(n - 1);
//        }
//        else {
//            return 1;
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Factorial of 5 is " + factorial(5));
//    }
//
//}

//public class Main {
//    public static void main(String[] args) {
//        int result = sum(5);
//        System.out.println(result);
//    }
//    public static int sum(int k) {
//        if (k > 0 ) {
//            return k + sum(k - 1);
//        }
//        else {
//            return 0;
//        }
//    }
//
//}




//Java Arrays****

//import java.util.Arrays;
//
//public  class Main {
//    public static void main(String[] args) {
//        String[] cars = {"BMW", "Volvo", "Ford", "Mazda"};
//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i]);
//        }
//    }
//}




//public class Main {
//    public static void main(String[] args) {
//        int sum = 0;
//        int[] numbers = {10, 20, 30, 40};
//        for (int i = 0; i < numbers.length; i++){
//            sum += numbers[i];
//        }
//        System.out.println(sum);
//    }
//
//}



//public  class Main {
//    public static void main(String[] args) {
//        String[] cars = {"BMW", "Volvo", "Ford", "Mazda"};
//        for (String car : cars) {
//            System.out.println(car);
//        }
//    }
//}




//public class Main {
//    public static void D() {
//        float d = 40.5F;
//        System.out.println("In Mehthod D");
//    }
//    public static void C() {
//        double c = 30.5;
//        System.out.println("In Method C");
//    }
//
//    public static void B() {
//        int b = 20;
//        C(); //Calling C
//        System.out.println("In Method B");
//    }
//    public static void A() {
//        int a = 10;
//        B(); //Calling B
//        System.out.println("In Method A");
//    }
//
//    public static void main(String[] args) {
//        A(); //Start with function A
//        //D(); //Then call D
//    }
//}


//import java.util.Arrays;

//public class Main {
//    public static void main(String[] args) {
//        String[] myNum = new String[5];
//        myNum[0] = "Shadow";
//        myNum[1] = "java";
//        myNum[2] = "Python";
//        myNum[3] = "php";
//        myNum[4] = "C++";
//
//        myNum[1] = "Hot java";
//
//        for (int i = 0; i < myNum.length; i++) {
//            System.out.println(myNum[i]);
//        }
//
//
//    }
//
//}







//public class Main {
//    static void myMethod(String name, int age) {
//        System.out.println("Hi, I am " + name + " and I am " + age);
//    }
//
//    public static void main(String[] args) {
//        myMethod("Liam", 5);
//        myMethod("jenny", 8);
//        myMethod("Anja", 10);
//    }
//
//}


//public class Main {
//    // Create a checkAge() method with an integer variable called age
//    static void checkAge(int age) {
//        //If age is less than 18, print "access denied"
//        if (age < 18) {
//            System.out.println("Access denied - you are not old enough!");
//        }
//        //If age is greater than , or equal to 18,  print " access granted"
//        else {
//            System.out.println("Access granted - you are old enough");
//        }
//
//    }
//
//    public static void main(String[] args) {
//        checkAge(35);
//    }
//
//}









//JAVA CLASS AND OBJECTS**************
//-------------------------------------




//public class Main {
//    int x = 5;
//
//    public static void main(String[] args) {
//        Main myObj = new Main(); // it's a objects
//        System.out.println(myObj.x);
//    }
//
//}




//public class Main {
//    int x = 10;
//
//    public static void main(String[] args) {
//        Main myObject_A = new Main();
//        Main myObject_B = new Main();
//
//        System.out.println(myObject_A.x);
//        System.out.println(myObject_B.x);
//    }
//
//}




//public class Main {
//    int x = 5;
//}




//class Main {
//    int x = 12;
//
//    public static void main(String[] args) {
//        Main myObj = new Main();
//        Main myObj1 = new Main();
//
//        System.out.println(myObj1.x);
//        System.out.println(myObj.x);
//    }
//
//}




//public class Main {
//    int x = 5;
//
//    public static void main(String[] args) {
//        Main myObj = new Main();
//
//        System.out.println(myObj.x);
//    }
//
//}





//public class Main {
//    int x = 15;
//
//    public static void main(String[] args) {
//        Main myObj = new Main();
//        Main myObj2 = new Main();
//
//        myObj.x = 40;
//
//        System.out.println(myObj.x); // Output will be 40
//        System.out.println(myObj2.x); // Output will be 15
//    }
//
//}




//public class Main {
//    String fname = "Riyad";
//    String lname = "Bepari";
//    int age = 24;
//
//    public static void main(String[] args) {
//        Main myObj = new Main();
//
//        System.out.println("Name: " + myObj.fname + " " + myObj.lname + " | age: " +myObj.age);
//
//    }
//
//}





//public class Main {
//    static void myMethod(String x) {
//        System.out.println("Hello " + x);
//    }
//
//    public static void main(String[] args) {
//        myMethod("World");
//    }
//
//}






// Create a Main class
//public class Main {
//
//    // Create a fullThrottle() method
//    public void fullThrottle() {
//        System.out.println("The car is going as fast as it can! ");
//    }
//
//    // Create a speed () method and add a parameter
//    public void speed(int maxSpeed) {
//        System.out.println("Max speed is: " + maxSpeed);
//    }
//
//    // Inside main, call the methods on the myCar object
//
//    public static void main(String[] args) {
//        Main myCar = new Main(); // Create a myCar object
//
//        myCar.fullThrottle();  // Call the  fullThrottle() method
//        myCar.speed(280); // Call the speed () method
//
//        System.out.println();
//    }
//
//}





//public class Main {
//    public void fullThrottle() {
//        System.out.println("The car is going as fast as it can!");
//    }
//
//    public void speed(int maxSpeed) {
//        System.out.println("The max speed is " + maxSpeed);
//    }
//}






//public class Main {
//
//    public void fullThtottle() {
//        System.out.println("The car is going as fast as it can! ");
//    }
//
//    public void speed(int maxSpeed) {
//        System.out.println("Max speed is: " + maxSpeed);
//    }
//
//    public static void main(String[] args) {
//        Main myCar = new Main();
//
//        myCar.fullThtottle();
//        myCar.speed(280);
//    }
//
//
//}







// A constructor in java is a special method that is used to initialize objects.*********
// The constructor is called when A objects of class Is created.*****


// Create a Main class.
//public class Main {
//    int x; // Create a class attribute
//
//    // Create a class constructor for the  Main class
//
//    public Main() {
//        x = 5; // Set the initial value for the class attribute x
//    }
//
//    public static void main(String[] args) {
//        Main myObj = new Main();
//
//        System.out.println(myObj.x);
//    }
//
//}




//public class Main {
//    int x;
//
//    public Main(int y) {
//        x = y;
//    }
//
//    public static void main(String[] args) {
//        Main myObj = new Main(10);
//        System.out.println(myObj.x);
//    }
//
//}




//public class Main {
//    int modelYear;
//    String modelName;
//
//    public Main(int year, String name) {
//        modelYear = year;
//        modelName = name;
//    }
//
//    public static void main(String[] args) {
//        Main myObj = new Main(25, "shadow");
//
//        String p_name = myObj.modelName;
//        int pYear = myObj.modelYear;
//        System.out.println("Name: " + p_name + " " + pYear);
//
//    }
//
//}







//public class Main {
//    int x;
//
//    public Main() {
//        x = 5;
//    }
//
//    public static void main(String[] args) {
//        Main myObj = new Main();
//        System.out.println(myObj.x);
//    }
//
//}



//public class Main {
//    int x;
//
//    public Main(int y) {
//        x = y;
//    }
//
//    public static void main(String[] args) {
//        Main obj = new Main(5);
//        System.out.println(obj.x);
//    }
//
//}









//public class Main {
//    public static void main(String[] args) {
//        int[] array = {11, 23, 43, 45};
//        for (int i = 0; i < 4; i++) {
//            System.out.println(array[i]);
//        }
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        int[] array = new int[4];
//        for (int i = 0; i < 4; i++) {
//            System.out.println(array[i]);
//        }
//    }
//
//}




//public class Main {
//    public static void main(String[] args) {
//        int[] array = new int[] {12, 34, 45, 456, 45};
//        for (int i = 0; i < 5; i++) {
//            System.out.println(array[i]);
//        }
//    }
//
//}





//public class Main {
//    protected String brand = "Ford";
//
//    public void honk() {
//        System.out.println(" tuut  tuut");
//    }
//}
//
//
//class Car extends Main {
//    private String modelName = "mustang";
//
//    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.honk();
//
//        System.out.println(myCar.brand + " " + myCar.modelName);
//    }
//
//}


//class Animal {
//
//    public void sound(){
//        System.out.println("Animal makes sound");
//    }
//}
//
//class Dog extends Animal {
//
//    @Override
//    public void sound(){
//        System.out.println("Dog barks");
//    }
//}
//
//class Cat extends Animal {
//
//    @Override
//    public void sound(){
//        System.out.println("Cat meows");
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Animal myDog = new Dog();
//        myDog.sound();
//
//        Animal myCat = new Cat();
//        myCat.sound();
//    }
//}



import java.io.File;        // Import the File class
import java.io.IOException;     // Import IOException to handle errors

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("Info.txt");  //Create file object

            if (file.createNewFile()) {   //try to create the file
                System.out.println("File created: " + file.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        }
        catch (IOException e) {
            System.out.println("an error occurred.");
            e.printStackTrace(); //Show error details
        }
    }

}
