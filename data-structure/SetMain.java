import java.util.LinkedHashSet;
import java.util.Set;

public class SetMain {
    /*
     * Set: datanya unique, tidak duplicate
     * HashSet: tidak menjamin sesuai urutan kita menambah data
     * LinkedHashSet: akan sesuai dengan urutan kita menambhakan data
     */
    public static void main(String[] args) {
        // Set<Integer> umur = new HashSet<>();
        Set<Integer> umur = new LinkedHashSet<>();
        umur.add(3);
        umur.add(3);
        umur.add(4);
        umur.add(2);
        umur.add(1);
        System.out.println(umur);
    }
}
