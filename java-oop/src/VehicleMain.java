public class VehicleMain {
    public static void main(String[] args) {
        SuperCar car1 = new SuperCar();
        car1.setModel("lambo");
        car1.setTurboType("nos");
        car1.setSpeed(100);
        car1.display();
        car1.increaseSpeed();
        car1.increaseSpeed();
        car1.increaseSpeed();
        car1.display();

        ClassicCar car2 = new ClassicCar();
        car2.setHistory("mobil pahlawan");
        car2.setSpeed(40);
        car2.increaseSpeed();
        car2.showDetailClassicCar();
    }
}
