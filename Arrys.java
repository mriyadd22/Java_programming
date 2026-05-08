import java.util.Arrays;


//use int roll[] = {} (without specifying the number of elements)
//to create the array and assign values at the same time

//public  class Arrys {
//    public static void main(String[] args) {
//        int[] roll = {12, 34, 56, 23, 56};
//
//        System.out.println(roll.length);
//    }
//
//}





//Use String cars = new String[4] to create an empty array with 4 slots, and then fill them later

public class Arrys {
    public static void main(String[] args) {
        String[] name = new String[5];
        name[0] = "korim";
        name[1] = "rohim";
        name[2] = "abir";
        name[3] = "abul";
        name[4] = "kuddus";

        Arrays.sort(name);

        System.out.println(Arrays.toString(name));
    }

}