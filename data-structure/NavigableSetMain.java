import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetMain {
    public static void main(String[] args) {
        NavigableSet<Integer> umur = new TreeSet<>();
        // NavigableSet<Integer> umurDesc = umur.descendingSet(); // desc
        NavigableSet<Integer> umurDesc = umur; // asc
        umur.add(3);
        umur.add(3);
        umur.add(4);
        umur.add(2);
        System.out.println(umurDesc);
    }
}
