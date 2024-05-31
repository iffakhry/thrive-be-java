// polymorphism overloading
class Matematika{
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }

    public String add(String a, String b){
        return a+b;
    }
}


public class MathMain {
    public static void main(String[] args) {
        //overloading
        Matematika math1 = new Matematika();
        System.out.println(math1.add(1, 2));
        System.out.println(math1.add(1.2,2.3));
        System.out.println(math1.add("hello", "world"));
    }
}
