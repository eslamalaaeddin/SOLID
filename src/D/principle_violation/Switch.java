package D.principle_violation;


public class Switch {
    Fan fan;
    boolean on;

    public Switch(Fan fan) {
        this.fan = fan;
    }

    public void press(){
        if (on){
            fan.turnOff();
            on = false;
        }
        else {
            fan.turnOn();
            on = true;
        }
    }


}
