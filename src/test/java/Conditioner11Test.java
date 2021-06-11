import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Conditioner11Test {

    @Test
    void calculateFreeze() {
        Conditioner_1_1 first  = new Conditioner_1_1();
        int expected = 10;
        int actual = first.calculate(10,20,"freeze");
        assertEquals(expected,actual);
    }
    @Test
    void calculateHeat() {
        Conditioner_1_1 first  = new Conditioner_1_1();
        int expected = 20;
        int actual = first.calculate(10,20,"heat");
        assertEquals(expected,actual);
    }
    @Test
    void calculateFan() {
        Conditioner_1_1 first  = new Conditioner_1_1();
        int expected = 10;
        int actual = first.calculate(10,20,"fan");
        assertEquals(expected,actual);
    }
    @Test
    void calculateAuto() {
        Conditioner_1_1 first  = new Conditioner_1_1();
        int expected = 20;
        int actual = first.calculate(15,20,"auto");
        assertEquals(expected,actual);
    }
    @Test
    void calculateWrongCommand() {
        Conditioner_1_1 first  = new Conditioner_1_1();
        int expected = -1;
        int actual = first.calculate(10,20,"rerret");
        assertEquals(expected,actual);
    }
}