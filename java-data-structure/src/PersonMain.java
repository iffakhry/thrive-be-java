
class Person {
    private String name;
    private boolean active;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }
}

// encapsulation

public class PersonMain {
    public static void main(String[] args) {

        Person person1 = new Person();
//        person1.name = "andi"; // tidak bisa karena name nya private.
        person1.setName("andi");
        System.out.println(person1.getName());
        person1.setActive(true);
        System.out.println(person1.isActive());

    }
}
