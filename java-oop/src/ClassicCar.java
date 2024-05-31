public class ClassicCar extends Vehicle{
    private String history;

    public void setHistory(String history) {
        this.history = history;
    }

    public String getHistory() {
        return history;
    }
    public void showDetailClassicCar(){
        System.out.println("history "+history);
        System.out.println("current speed "+getSpeed());
    }
}
