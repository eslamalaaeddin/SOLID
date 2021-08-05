package L.principle_violation;

public class Fish extends Animal {

    @Override
    public void eat() {
        System.out.println("Fish eats.");
    }

    public void swim(){
        System.out.println("Fish swims");
    }
}
