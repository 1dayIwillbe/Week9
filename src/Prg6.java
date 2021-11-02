import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Prg6 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> arylst = new ArrayList<>();
        System.out.println("Please Enter 5 Values:");
        for (int i = 0; i <5 ; i++) {
            arylst.add(reader.nextInt());
        }
        System.out.println("Please enter location number to get value:");
       int i = reader.nextInt();
       if (i >= 0 && i<=5){
           System.out.println("Value at Index "+i +" is :" + arylst.get(i));
       } else {
           System.out.println("Please enter value between 0 and 5");
                 }

        reader.close();
    }

}
