package L.principle_adherence;

public class Cat extends LandAnimal {

    @Override
    public void walk() {
        System.out.println("Cat walks.");
    }

    @Override
    public void run() {
        System.out.println("Cat runs.");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats.");
    }
}
