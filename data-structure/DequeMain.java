
import java.util.Deque;
import java.util.LinkedList;

public class DequeMain {
    public static void main(String[] args) {
        // pendekatan antrian / queue FIFO
        Deque<String> antrian = new LinkedList<>();
        antrian.offerLast("januari");
        antrian.offerLast("februari");
        antrian.offerLast("maret");
        antrian.offerLast("april");
        System.out.println(antrian.pollFirst());
        System.out.println(antrian.pollFirst());
        System.out.println(antrian.pollFirst());
        System.out.println(antrian.pollFirst());

        // pendekatan LIFO
        System.out.println("LIFO");
        Deque<String> stack = new LinkedList<>();
        stack.offerLast("januari");
        stack.offerLast("februari");
        stack.offerLast("maret");
        stack.offerLast("april");
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());


    }
}
