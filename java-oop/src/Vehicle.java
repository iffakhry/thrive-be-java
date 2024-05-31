public class Vehicle {
    private String color;
    private int speed;

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed(){
        this.speed++;
    }

    public void brakeSpeed(){
        this.speed--;
    }
}
