//interface Interface {
//    static final String name = "Riyad";
//    static final int roll = 842103;     //Member Variable
//
//    void display(); // interface method (does not have a body)
//}
//
//class Result implements Interface {
//    float mark;
//
//    public void display() {     //The body of sleep() is provided here
//        System.out.println("Name: " + name);
//        System.out.println("Roll: " + roll);
//    }
//
//    void getMark() {        //own method defined
//        mark = 3.98F;
//    }
//
//    void showMark() {       //own method defined
//        System.out.println("mark: " + mark);
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        Result r = new Result();
//
//        r.display();
//        r.getMark();
//        r.showMark();
//    }
//
//}







////Interface
//interface Interface {
//    void animalSound();     // interface method (does not have a body)
//    void sleep();       // interface method (does not have a body)
//}
//
//
//// Cat "implements" the above interface
//
//class Cat implements Interface {
//    public void animalSound() {     // The body of animalSound() is provided here
//        System.out.println("the Cat says: Meow meow hahaha");
//    }
//
//    public void sleep() {       // The body of sleep() is provided here
//        System.out.println("Cat sleep: Zzzzzzzz");
//    }
//}
//
//
//class Main {
//    public static void main(String[] args) {
//        Cat c = new Cat();      // Create a Pig object
//        c.animalSound();
//        c.sleep();
//    }
//
//}