public class Hello {
    public static void main(String[] args) {
        System.out.println("hello world");
        tambah(2,3); // integer
        System.out.println(tambah(2.5,3.7)); // double

        Hello helloObj = new Hello();
        helloObj.sayHello("fakhry");
        var hasilKali = helloObj.perkalian(2,3);
        System.out.println(hasilKali);

        System.out.println(helloObj.penjumlahan(1,2,3,4,5));
    }

    public static void tambah(int a, int b){
        System.out.println(a+b);
    }

    // overloading
    public static double tambah(double a, double b){
        return a+b;
    }

    int perkalian(int a, int b){
        return a*b;
    }

    int penjumlahan(int... values){
        int sum  = 0;
        for (var v : values){
            sum+= v;
        }
        return sum;
    }

    public void sayHello(String nama){
        System.out.println("hello "+nama);
    }
}
