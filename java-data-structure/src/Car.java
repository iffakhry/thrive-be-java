class Car {
    // field
    String name;
    String engineCC;
    String fuel;
    final String road = "aspal";

    // constructor: sebuah method yang namanya sama dg nama class
    Car(String paramName){
        name = paramName;
    }

    Car(){
        this(null);
    }

    Car(String name, String fuel){
        this.name = name;
        this.fuel = fuel;
    }

    // method
    void bunyiKnalpot(String paramName){
        System.out.println("bunyi knalpot "+this.name+" adalah: "+ paramName);
    }

    void isiBBM(String fuel){
        System.out.println("mobil "+this.name+" diisi "+this.fuel+ " dengan "+fuel);
    }

}
