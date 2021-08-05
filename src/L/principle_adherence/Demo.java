package L.principle_adherence;

public class Demo {
    public static void main(String[] args) {
        SeaAnimal animal = new SeaAnimal();

        Fish fish = new Fish();
        fish.eat();
        fish.swim();


        animal = fish;
        animal.eat();
        animal.swim();
    }

}
