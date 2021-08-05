package D.principle_adherence;

public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan On");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan Off");
    }
}
