import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ImmutableList {
    public static void main(String[] args) {
        List<Integer> umur = new LinkedList<>();
        var umurImmutable = Collections.unmodifiableList(umur);
        umurImmutable.add(2); //error
        umur.add(17);
        umur.add(60);
        umur.add(30);
        System.out.println(umur.get(2));
        System.out.println(umur);
    }
}
