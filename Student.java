//class Student {
//    private String name;    // private = restricted access
//    private int roll;
//
//    //Setter
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setRoll(int roll) {
//        if (roll > 0) {
//            this.roll = roll;
//        }
//        else {
//            System.out.println("Invalid age");
//        }
//    }
//
//    //getter
//
//    public String getName() {
//        return name;
//    }
//
//    public int getRoll() {
//        return roll;
//    }
//
//}










/* Multilevel Inheritance*/

//class Student {
//    String name;
//    int roll;
//
//    void getData(String n, int r) {
//        this.name = n;
//        this.roll = r;
//    }
//
//    void display() {
//        System.out.println("Inside Student class");
//        System.out.println("Name: " + name);
//        System.out.println("Roll: " + roll);
//        System.out.println();
//    }
//}
//
//
//class Exam extends Student {
//    float mark;
//
//    void getData(float m) {
//        this.mark = m;
//    }
//
//
//    void display() {
//        super.display();    //Access parent class display
//        System.out.println("Inside Exam class");
//        System.out.println("mark: " + mark);
//        System.out.println();
//    }
//}
//
//
//class Address extends Exam {
//    String address;
//
//
//    void getDAta(String a) {
//        this.address = a;
//    }
//
//    void display() {
//        super.display();    //Access parent class display
//        System.out.println("Inside Address class");
//        System.out.println("my address: " + address);
//    }
//}




abstract class Student {
    abstract void animalSound();
    void sleep(){
        System.out.println("Zzzz");
    }
}

class pig extends Student{
    void animalSound() {
        System.out.println("pig say: Wee Wee");
    }

    public static void main(String[] args) {
        pig p = new pig();
        p.animalSound();
        p.sleep();
    }

}