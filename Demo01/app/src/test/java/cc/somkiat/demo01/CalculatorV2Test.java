package cc.somkiat.demo01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorV2Test {

    private int no1;
    private int no2;
    private int expectedResult;

    public CalculatorV2Test(int no1, int no2, int expectedResult) {
        this.no1 = no1;
        this.no2 = no2;
        this.expectedResult = expectedResult;
    }

    @Parameters(name = "{0} + {1} = {2}")
    public static List<Object[]> xxxx() {
        return Arrays.asList(new Object[][] {
                {1, 2, 3},
                {5, -1, 4},
        });
    }

    @Test
    public void การบวกเลขจำนวนเต็ม() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.add(this.no1, this.no2);
        assertEquals(this.expectedResult, actualResult);
    }


}
