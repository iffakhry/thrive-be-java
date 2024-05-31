class Mobil {
    private String name;
    private String category;

    public Mobil(){
    }
    public Mobil(String name, String category){
        this.name = name;
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

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
//        panther.name = "toyota panther"; // error
//        panther.category = "mobil klasik";
        panther.setName("toyota panther");
        panther.setCategory("mobil diesel");
        panther.isiBahanBakar("solar");

        Mobil vw = new Mobil("vw kodok", "mobil antik");
        System.out.println(vw.getName());

        Motor trail = new Motor();
        trail.tipe = "trail adventure";
        trail.pasangKnalpot();

    }
}
