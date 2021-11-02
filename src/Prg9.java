import java.util.HashMap;

/**
 * Create a HashMap object called people that will store String keys and Integer
 *         values: And use for each loop to iterate the value from Map.
 */
public class Prg9 {

    public static void main(String[] args) {
        HashMap <String,Integer> people  = new HashMap <> ();
        people.put("India",31);
        people.put("China",42);
        people.put("America",53);
        people.put("France",24);

        for (Object element : people.entrySet()) {
            System.out.println(element + " ");
        }



    }
}
