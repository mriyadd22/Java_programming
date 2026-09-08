//public class DecisionMaking {
//    public static void main(String[] args) {
//        int age = 25;
//
//        if (age > 20) {
//            System.out.println("age is greater than 20");
//        }
//    }
//
//}


//public class DecisionMaking {
//    public static void main(String[] args) {
//        boolean isRaining = true;
//
//        if (isRaining) {
//            System.out.println("Bring an umbrella");
//        }
//    }
//
//}



//public class DecisionMaking {
//    public static void main(String[] args) {
//        int num = 13;
//
//        if (num % 2 == 0) {
//            System.out.println("The number is Even");
//        }
//        else {
//            System.out.println("The number is  Odd");
//        }
//    }
//
//}


//public class DecisionMaking {
//    public static void main(String[] args) {
//        boolean isRaining = false;
//
//        if (isRaining) {
//            System.out.println("Bring an umbrella");
//        }
//        else {
//            System.out.println("No rain today. no need for umbrella");
//        }
//    }
//
//}


//public class DecisionMaking {
//    public static void main(String[] args) {
//        int num = -10;
//
//        if (num > 0) {
//            System.out.println("It's a Positive Number");
//        }
//        else if (num == 0) {
//            System.out.println("It's Zero");
//        }
//        else {
//            System.out.println("It's a Negative");
//        }
//    }
//
//}


//public class DecisionMaking {
//    public static void main(String[] args) {
//        int time = 16;
//
//        if (time < 12) {
//            System.out.println("good morning");
//        }
//        else if (time < 18) {
//            System.out.println("good day");
//        }
//        else {
//            System.out.println("good evening");
//        }
//    }
//
//}



public class DecisionMaking {
    public static void main(String[] args) {
        int score = 69;
        String grade = null;

        switch (score/10) {
            case 10:
                grade = "A+";
                break;
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B+";
                break;
            case 7:
                grade = "B";
                break;
            case 6:
                grade = "C";
                break;
            case 5:
                grade = "D";
                break;
            default:
                grade = "F";
                break;
        }
        System.out.println("grade: " + grade);
    }

}