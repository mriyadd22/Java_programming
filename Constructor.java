//public class Constructor {
//    int modelYear;
//    String modelName;
//
//    //constructor
//    public Constructor(int year, String name) {
//        modelYear = year;
//        modelName = name;
//    }
//
//    public static void main(String[] args) {
//        Constructor myCar = new Constructor(1990, "mustang");
//        System.out.println(myCar.modelName + " " + myCar.modelYear);
//    }
//
//}





//public class Constructor {
//    String name;
//
//    Constructor(String n) {
//        name = n;
//    }
//
//    void display() {
//        System.out.println("name: " + name);
//    }
//
//    public static void main(String[] args) {
//        Constructor cob = new Constructor("Riyad");
//        cob.display();
//    }
//
//}




//public class Constructor {
//    String name;
//    int roll;
//
//    // Parameterized Constructor
//    Constructor(String n, int r) {
//        name = n;
//        roll = r;
//    }
//
//    // Copy Constructor
//    Constructor(Constructor d) {
//        name = d.name;
//        roll = d.roll;
//    }
//
//
//    void display() {
//        System.out.println("name: " + name);
//        System.out.println("roll: " + roll);
//    }
//
//
//    public static void main(String[] args) {
//        Constructor cob = new Constructor("Shadow", 333);
//        cob.display();
//
//        System.out.println();
//
//        //This would invoke the copy Constructor;
//        Constructor c2 = new Constructor(cob);
//        System.out.println("Record of S2");
//        c2.display();
//    }
//
//}








//public class Constructor {
//    String name;
//    int capability;
//    int numberOfDept;
//
//        //parameterized Constructor;
//    Constructor(String n, int c, int nD) {
//        name = n;
//        capability = c;
//        numberOfDept = nD;
//    }
//
//        //Copy Constructor
//    Constructor(Constructor s) {
//        name = s.name;
//        capability = s.capability;
//        numberOfDept = s.numberOfDept;
//    }
//
//    void display() {
//        System.out.println("name: " + name);
//        System.out.println("Capability; " + capability);
//        System.out.println("number of dept: " + numberOfDept);
//    }
//
//    public static void main(String[] args) {
//        Constructor root = new Constructor("DUET", 1200, 12);
//        root.display();
//
//        System.out.println();
//
//        Constructor sub = new Constructor(root);
//        sub.display();
//
//    }
//
//}





// Use This method
//public class Constructor {
//    String name;
//    int age;
//
//    Constructor(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    void display() {
//        System.out.println("My name is: " + name + " and I'm " + age);
//    }
//
//    public static void main(String[] args) {
//        Constructor This = new Constructor("Riyad", 13);
//        This.display();
//
//    }
//
//}







//Calling a Constructor from Another Constructor

//public class Constructor {
//    String modelName;
//    int modelYear;
//
//    Constructor(String modelName){
//        this(modelName, 2020);
//    }
//
//    Constructor(String modelName, int modelYear) {
//        this.modelName = modelName;
//        this.modelYear = modelYear;
//    }
//
//    void printInfo() {
//        System.out.println(modelName + " " + modelYear);
//    }
//
//    public static void main(String[] args) {
//        Constructor car1 = new Constructor("Corvette");
//        Constructor car2 = new Constructor("Ford");
//
//        car1.printInfo();
//        car2.printInfo();
//    }
//
//}




//public class Constructor {
//    String name;
//    int roll;
//    float mark;
//
//    // parameterized Constructor:
//    Constructor(String n, int r, float m ) {
//        name = n;
//        roll = r;
//        mark = m;
//    }
//
//    //Copy Constructor
//    Constructor(Constructor s) {
//        this.name = s.name;
//        this.roll = s.roll;
//        this.mark = s.mark;
//    }
//
//    void display() {
//        System.out.println("name: " + name);
//        System.out.println("roll: " + roll);
//        System.out.println("mark: " + mark);
//    }
//
//    public static void main(String[] args) {
//        Constructor s1 = new Constructor("Riyad", 23, 3.40F);
//        System.out.println("First Record");
//        s1.display();
//        System.out.println();
//
//        Constructor s2 = new Constructor(s1);
//        System.out.println("Second Record");
//        s2.display();
//    }
//
//
//}