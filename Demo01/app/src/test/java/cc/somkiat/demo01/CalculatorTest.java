package cc.somkiat.demo01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void ห้าบวกลบหนึ่งต้องได้สี่นะ() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.add(5, -1);
        assertEquals(4, actualResult);
    }

    @Test
    public void หนึ่งบวกสองต้องได้สามนะ() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.add(1, 2);
        assertEquals(3, actualResult);
    }


}
