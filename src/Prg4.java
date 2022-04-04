/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop
 */

import java.util.ArrayList;

public class Prg4 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Violet");
        arrayList.add("Indigo");
        arrayList.add("Blue");
        arrayList.add("Green");
        arrayList.add("Yellow");
        arrayList.add("Orange");
        arrayList.add("Red");

           for (String elements:arrayList)  {
               System.out.println(elements);
                System.out.println("name");
           }

    }

}
