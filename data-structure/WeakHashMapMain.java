import java.util.WeakHashMap;
import java.util.Map;

public class WeakHashMapMain {

    /*
     * HashMap: akan menjaga /keep datanya
     * WeakHashmap: jika datanya terindikasi tidak digunakan, maka secara otomatis akan dihapus oleh GC
     * 
     */
    public static void main(String[] args) {
        Map<Integer, Integer> data = new WeakHashMap<>();

        for (int i = 0; i < 1000000; i++) {
            data.put(i, i);
        }

        System.gc();
        System.out.println(data.size());
    }
}
