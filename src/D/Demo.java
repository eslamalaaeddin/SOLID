package D;

import D.principle_adherence.Fan;
import D.principle_adherence.Lamp;
import D.principle_adherence.Switchable;
import D.principle_adherence.TV;
import D.principle_violation.Switch;

/**
 * It is also an example of OCP, but, i will provide another example of OCP in package O
 */
public class Demo {


    public static void main(String[] args) {
        //Violation
        D.principle_violation.Fan f = new D.principle_violation.Fan();
        Switch s = new Switch(f);
        s.press();
        //If you want to turn on/off tv or any thing except fan, you have to
        //open your code (Switch class) and change its constructor to TV and so on ....

        //Adherence
        Switchable fan = new Fan();
        Switchable tv = new TV();
        Switchable lamp = new Lamp();

        fan.turnOn();
        fan.turnOff();

        tv.turnOn();
        tv.turnOff();

        lamp.turnOn();
        lamp.turnOff();
    }

}
