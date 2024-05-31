import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class ImmutableSetMain {
    public static void main(String[] args) {
        Set<Integer> umur = new LinkedHashSet<>();
        Set<Integer> umurImmutable = Collections.unmodifiableSet(umur);
        umurImmutable.add(10); // error
        umur.add(3);
        umur.add(3);
        umur.add(4);
        umur.add(2);
        System.out.println(umur);
    }
}
