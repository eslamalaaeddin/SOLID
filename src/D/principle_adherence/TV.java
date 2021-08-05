package D.principle_adherence;

public class TV implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("TV On");
    }

    @Override
    public void turnOff() {
        System.out.println("TV Off");
    }
}
