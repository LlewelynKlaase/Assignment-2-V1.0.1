package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarsListTest {

    List<String> myCarsListTest = new ArrayList<>();

    @BeforeEach
    @Test
    void setUp() {
        myCarsListTest.add("Audi");
        myCarsListTest.add("BMW");
        myCarsListTest.add("Mercedes Benz");
    }
}