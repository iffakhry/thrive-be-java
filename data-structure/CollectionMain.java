import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) {
        Collection<String> students = new ArrayList<>();
        students.add("andi");
        students.add("budi");
        // System.out.println(students);
        for (var student : students) {
            System.out.println("nama student:" + student);
        }

        students.remove("budi"); // case sensitive
        System.out.println(students);
        students.addAll(Arrays.asList("cindy", "deni", "edi"));
        System.out.println(students);
        students.removeAll(List.of("cindy", "deni"));
        System.out.println(students);

        // mengecek data dicollection
        System.out.println(students.contains("andi")); // case sensitive
        System.out.println(students.containsAll(List.of("andi", "budi")));

    }
}