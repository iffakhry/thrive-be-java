import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapMain {

    public static void main(String[] args) {
        Map<String, Integer> bulan = new IdentityHashMap<>();
        var key = "Januari.Awal";
        var awal = "Awal";
        var key2 = "Januari" + "." + awal;
        System.out.println(key);
        System.out.println(key2);

        bulan.put(key, 1);
        bulan.put(key2, 2);
        bulan.put("Agustus", 8);

        System.out.println(key.equals(key2)); // true --> hashmap
        System.out.println(key == key2); // false --> identityhashmap
        System.out.println(bulan.size());
    }
}