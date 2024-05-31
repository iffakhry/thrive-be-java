public class SuperCar extends Vehicle{
    private String model;
    private String turboType;

    public void setModel(String model) {
        this.model = model;
    }

    public void setTurboType(String turboType) {
        this.turboType = turboType;
    }

    public String getModel() {
        return model;
    }

    public String getTurboType() {
        return turboType;
    }

    public void display(){
        System.out.println("model: "+model);
        System.out.println("turbo type: "+turboType);
        System.out.println("current speed: "+getSpeed());
    }
}
