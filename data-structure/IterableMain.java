import java.util.List;

public class IterableMain{
    public static void main(String[] args) {
        Iterable<String> students = List.of("andi", "budi", "cindy", "deni");
        for (var student : students) {
            System.out.println(student);
        }

        // menggunakan iterator
        // Iterator<String> iterator = students.iterator();
        // while (iterator.hasNext()) { 
        //     String student = iterator.next();
        //     System.out.println(student);
        // }
    }
}