import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapMain {
/*
 * LinkedHashMap: urutan data yang dimasukkan akan dijaga, data yg pertama masuk, akan ditampilkan yg pertama juga
 * karena pakai pendekatan double linked list
 * 
 */
    public static void main(String[] args) {
        Map<String, Integer> bulan = new LinkedHashMap<>();
        bulan.put("Januari", 1);
        bulan.put("Februari", 2);
        bulan.put("Agustus", 8);

        System.out.println(bulan);
    }
}
