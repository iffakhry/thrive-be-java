import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapMain {

    public static void main(String[] args) {
        SortedMap<String, Integer> bulan = new TreeMap<>();
        bulan.put("Januari", 5);
        bulan.put("Februari", 2);
        bulan.put("Agustus", 8);

        System.out.println(bulan);
    }
}
