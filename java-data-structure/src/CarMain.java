import java.util.ArrayList;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        // create object dari class car
        Car avanza = new Car();
        avanza.name = "avanza hybrid";
        avanza.engineCC = "2000cc";
        avanza.fuel = "bensin";
//        avanza.road = "circuit";

        avanza.bunyiKnalpot("brim brim brim");

        // create object dari class car
        var lambo = new Car("aventador");
//        lambo.name = "aventador";
        lambo.fuel = "pertamax turbo";
        lambo.bunyiKnalpot("brum brum");

        var kijang = new Car("kijang", "bensin");
//        kijang.fuel = "solar";
        kijang.isiBBM("pertamax");

    }
}
