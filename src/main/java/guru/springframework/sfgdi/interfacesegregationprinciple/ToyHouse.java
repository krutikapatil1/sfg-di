package guru.springframework.sfgdi.interfacesegregationprinciple;

public class ToyHouse implements Toy{
    @Override
    public void setPrice(double price) {
        System.out.println("Setting price for ToyHouse: " +price);
    }
    @Override
    public void setColor(String color) {
        System.out.println("Setting color for ToyHouse: " +color);
    }
}
