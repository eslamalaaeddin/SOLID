package D.principle_adherence;

public class Lamp implements Switchable{
    
    @Override
    public void turnOn() {
        System.out.println("Lamp On");
    }

    @Override
    public void turnOff() {
        System.out.println("Lamp Off");
    }
}
