class Hewan {
    public String name;
    public void makeSound(){
        System.out.println("suara hewan...");
    }
}

class Kucing extends Hewan{

    @Override
    public void makeSound() {
        System.out.println("meong");
    }
}

class Ayam extends Hewan{

    @Override
    public void makeSound() {
        System.out.println("petok petok");
    }
}

// polymorphism overriding
public class HewanMain {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing();
        kucing1.name = "kucing1";
        kucing1.makeSound();

        Ayam ayam1 = new Ayam();
        ayam1.makeSound();

        Hewan hewan1 = new Kucing();
        hewan1.makeSound(); //meong

        Hewan hewan2 = new Ayam();
        hewan2.makeSound();
    }
}
