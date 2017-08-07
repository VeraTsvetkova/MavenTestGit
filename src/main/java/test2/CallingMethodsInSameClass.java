package test2;

/**
 * Created by zhivkokasabov on 6/29/2017.
 */
public class CallingMethodsInSameClass {



    public static void main(String[] args) {
        printOne();
        printOne();
        printTwo();
    }


    public static void printOne() {
        System.out.println("vera");
    }

    public static void printTwo() {
        printOne();
        printOne();
    }
}