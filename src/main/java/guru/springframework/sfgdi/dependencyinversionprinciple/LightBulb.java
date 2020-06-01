package guru.springframework.sfgdi.dependencyinversionprinciple;

public class LightBulb implements Switchable{
    @Override
    public void turnOff() {
        System.out.println("Light Bulb turned off");
    }

    @Override
    public void turnOn() {
        System.out.println("Light Bulb turned on");
    }
}
