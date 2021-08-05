package L.principle_adherence;

public class Dog extends LandAnimal {

    @Override
    public void walk() {
        System.out.println("Dog walks.");
    }

    @Override
    public void run() {
        System.out.println("Dog runs.");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats.");
    }
}
