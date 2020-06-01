package guru.springframework.sfgdi.interfacesegregationprinciple;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToyBuilderTest {
    private ToyBuilder toyBuilder;

    @Test
    void buildToyHouse() {
        toyBuilder.buildToyHouse();
    }

    @BeforeEach
    void setUp() {
        toyBuilder = new ToyBuilder();
    }

    @Test
    void buildToyCar() {
        toyBuilder.buildToyCar();
    }

    @Test
    void buildToyPlane() {
        toyBuilder.buildToyPlane();
    }
}