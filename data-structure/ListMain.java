
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    /*
     * List: bisa duplicate datanya
     */
    public static void main(String[] args) {
        List<Integer> bilangan = new ArrayList<>();
        bilangan.add(10);
        bilangan.add(10);
        bilangan.add(20);
        bilangan.add(5);
        bilangan.add(7);
        bilangan.remove(2);
        System.out.println(bilangan);
        System.out.println(bilangan.get(1));
        for (Integer integer : bilangan) {
            System.out.println(integer);
        }

        List<Integer> umur = new LinkedList<>();
        umur.add(17);
        umur.add(60);
        umur.add(30);
        umur.add(1, 20);
        umur.set(1, 15);
        
        umur.addFirst(10);
        System.out.println(umur);
    }
}
