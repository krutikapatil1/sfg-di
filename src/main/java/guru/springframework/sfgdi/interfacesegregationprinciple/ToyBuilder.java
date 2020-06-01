package guru.springframework.sfgdi.interfacesegregationprinciple;

public class ToyBuilder {
    public static ToyHouse buildToyHouse() {
        ToyHouse toyHouse = new ToyHouse();
        toyHouse.setColor("blue");
        toyHouse.setPrice(2000);
        return toyHouse;
    }

    public static ToyCar buildToyCar() {
        ToyCar toyCar = new ToyCar();
        toyCar.setColor("indigo");
        toyCar.setPrice(6000);
        toyCar.move();
        return toyCar;
    }

    public static ToyPlane buildToyPlane() {
        ToyPlane toyPlane = new ToyPlane();
        toyPlane.setColor("green");
        toyPlane.setPrice(40000);
        toyPlane.move();
        toyPlane.fly();
        return toyPlane;
    }
}
