import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a Java program to test an array list is empty or not. Define array list with
 * underground tube names
 */
public class Prg7 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner obj = new Scanner(System.in);
        System.out.println("enter 5 Value :");
        for (int i = 0; i < 5; i++) {
            list.add(obj.nextLine());
        }
        obj.close();
        System.out.println("Original array list : " + list);
        System.out.println("Checking the above array list is empty or not...." + list.isEmpty());
        list.remove(2);
        System.out.println("Array list after remove element : " + list);
        list.removeAll(list);
        System.out.println("Array list after remove all element : " + list);
        System.out.println("Checking the above array list is empty or not...." + list.isEmpty());
    }

}
