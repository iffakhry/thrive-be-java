public class CLoop {
    public static void main(String[] args) {
        int angka1 = 0;
        int i = 0;
        // for (int i = 0; i < 10; i++) {
        // // angka1 = angka1+1;
        // System.out.println(i);
        // }

        while (angka1 < 10) {
            System.out.println(angka1);
            angka1++;
        }
        // do {
        // System.out.println(angka1++);
        // } while (angka1 <10);

        int[] dataAngka = { 1, 2, 3, 4 };

        for (var value : dataAngka) {
            System.out.println(value);
        }
    }
}
