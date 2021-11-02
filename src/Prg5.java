import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterator
 */
public class Prg5 {

     public static void main(String[] args) {
          Scanner obj = new Scanner(System.in);
          ArrayList<Integer> arrayList = new ArrayList<>();
          //User input 10 numbers in Array
          System.out.println("Enter 10 number of your choice");
          for (int j = 0; j < 10; j++) {
               arrayList.add(obj.nextInt());
          }
          //Print out using Iterator :
          Iterator iter = arrayList.iterator();
          while(iter.hasNext()) {
               Object element = iter.next();
               System.out.print(element + " ");
                   }
          obj.close();


     }

}
