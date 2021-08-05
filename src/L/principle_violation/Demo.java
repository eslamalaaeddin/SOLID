package L.principle_violation;

public class Demo {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Fish fish = new Fish();
        fish.eat();
        fish.swim();

        animal = fish;
        animal.eat();
        //This is the  result of bad design as animal (Super class) object can't be replaced by
        //a Frog object Subtype.
//        animal.swim();
    }

}
