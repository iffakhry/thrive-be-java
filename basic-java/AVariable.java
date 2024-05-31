import java.util.Scanner;

public class AVariable {
    public static void main(String[] args) {
        int angka = 10;
        System.out.println(angka);
        int umur = 20;
        byte umurPanjang = (byte) umur;
        System.out.println(umurPanjang);
        String nama = "budi";
        System.out.println("nama: " + nama);

        char[] data1 = new char[5];
        data1[0] = 'a';
        data1[1] = 'b';
        data1[2] = 'c';
        data1[3] = 'd';
        data1[4] = 'e';
        System.out.println(data1[0]);

        // operator
        boolean a = false;
        boolean b = false;

        if (a == false || b != true) {
            System.out.println("Right Condition");
        } else if (a != false && b == false) {
            System.out.println("Wrong");
        } else {
            System.out.println("No result");
        }

        int angka1 = 10;
        int angka2 = 20;
        var hasil = angka1 + angka2;
        System.out.println("hasil: "+hasil);

        String angka3 = "";
        System.out.println("angka3:"+angka3);

        // membaca input 
        Scanner input = new Scanner(System.in);
    	
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("You entered " + number);

        // closing the scanner object
        input.close();

    }
}
