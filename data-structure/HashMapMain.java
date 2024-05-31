import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

    public static void main(String[] args) {
        Map<String, Integer> bulan = new HashMap<>();
        bulan.put("Januari", 1);
        bulan.put("Februari", 2);
        bulan.put("Agustus", 8);
        bulan.put("Februari", 3);
        System.out.println(bulan);
        System.out.println(bulan.get("Januari"));
        System.out.println(bulan.get("Maret")); // null
    }
}