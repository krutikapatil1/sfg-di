package guru.springframework.sfgdi.dependencyinversionprinciple;

public class ElectricPowerSwitch implements Switch{
    public Switchable client;
    public boolean isOn;

    public ElectricPowerSwitch(Switchable client) {
        this.client = client;
        this.isOn = false;
    }

    public void press() {
        boolean checkIsOn = this.isOn;
        if(checkIsOn) {
            client.turnOff();
            this.isOn = false;
        }
        else {
            client.turnOn();
            this.isOn = true;
        }
    }

    public boolean isOn() {
        return this.isOn;
    }
}
