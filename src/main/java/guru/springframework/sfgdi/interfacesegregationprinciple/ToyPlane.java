package guru.springframework.sfgdi.interfacesegregationprinciple;

public class ToyPlane implements Toy, Moveable, Flyable{
    @Override
    public void fly() {
        System.out.println("Toy Plane flying");
    }

    @Override
    public void move(){
        System.out.println("Toy Plane moving");
    }

    @Override
    public void setPrice(double price) {
        System.out.println("Setting price for Toy Plane: " +price);
    }

    @Override
    public void setColor(String color) {
        System.out.println("Setting color for Toy Plane: " +color);
    }
}
