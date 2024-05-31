class Mobil {
    String name;
    String category;

    void isiBahanBakar(String fuel) {
        System.out.println("bahan bakar mobil "+name+" sudah terisi dengan "+fuel);
    }
}

class Motor {
    String tipe;

    void pasangKnalpot(){
        System.out.println("knalpot terpasang di "+tipe);
    }
}

public class MobilMain {
    public static void main(String[] args) {
        Mobil panther = new Mobil();
        panther.name = "toyota panther";
        panther.category = "mobil klasik";
        panther.isiBahanBakar("solar");

        Motor trail = new Motor();
        trail.tipe = "trail adventure";
        trail.pasangKnalpot();

    }
}
