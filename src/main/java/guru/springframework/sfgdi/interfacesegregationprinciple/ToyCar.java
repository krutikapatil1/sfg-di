package guru.springframework.sfgdi.interfacesegregationprinciple;

public class ToyCar implements Toy, Moveable{
    @Override
    public void move() {
        System.out.println("Toy car moving");
    }

    @Override
    public void setPrice(double price) {
        System.out.println("Setting price for Toy Car: " +price);
    }

    @Override
    public void setColor(String color) {
        System.out.println("Setting color for Toy Car: " +color);
    }
}
