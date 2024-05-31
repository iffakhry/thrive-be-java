
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMain {
    /*
     * Queue = antrian
     * PriorityQueue: diurutkan, menggunakan comparable berdasarkan binary heap. dimana binary heap menggunakan pendekatan complete binary tree
     * arraydequeue: prinsipnya menggunakan array
     * linkedlist : prinsipnya menggunakan double linkedlist
     * 
     * ref priorityqueue:
     * https://ioflood.com/blog/java-priority-queue/#:~:text=Java's%20PriorityQueue%20orders%20its%20elements,method%20of%20the%20Comparable%20interface.
     * https://visualgo.net/en/heap
     * https://en.wikipedia.org/wiki/Binary_tree#:~:text=In%20computer%20science%2C%20a%20binary,ary%20tree%20with%20k%20%3D%202.
     * 
     * add(): menambahkan data ke queue
     * offer(): menambahkan data ke queue
     * remove(): mengambil/membaca data antrian pertama, sekaligus menghapus dari antrian
     * poll(): mengambil/membaca data antrian pertama, sekaligus menghapus dari antrian, tapi jika data di antrian sudah habis maka akan return null
     * element(): membaca/mengambil, tanpa menghapus data dari antrian
     * peek()
     * 
     */
    public static void main(String[] args) {
        Queue<Integer> umur = new PriorityQueue<>();
        umur.add(20);
        umur.add(10);
        umur.add(15);
        umur.add(17);

        System.out.println(umur);
        System.out.println(umur.poll());

        Queue<String> queue = new ArrayDeque<>();
        queue.add("alta");
        queue.add("academy");
        queue.add("java");
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.size());

        for (var pointer = queue.poll(); pointer != null; pointer = queue.poll()) {
            System.out.println(pointer);
        }
    }
}
