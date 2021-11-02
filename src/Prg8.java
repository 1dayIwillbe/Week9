import java.util.HashSet;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
 * and if else)
 */
public class Prg8 {

    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(4);
        hashSet.add(7);
        hashSet.add(12);
        hashSet.add(15);
        hashSet.add(10);
        hashSet.add(8);

        for (int i = 1; i <= 10; i++) {
            if (hashSet.contains(i))
                System.out.println(i + " was found in the set.");
        }

    }
}
