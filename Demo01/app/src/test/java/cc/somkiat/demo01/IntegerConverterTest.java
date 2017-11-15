package cc.somkiat.demo01;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerConverterTest {

    @Test
    public void convert_from_string_to_integer_should_success() {
        IntegerConverter converter = new IntegerConverter();
        int result = converter.toInteger("1");
        assertEquals(1, result);
    }

    @Test(expected = NumberFormatException.class)
    public void convert_from_string_to_integer_should_fail_with_empty_string() {
        IntegerConverter converter = new IntegerConverter();
        converter.toInteger("");
    }

    @Test(expected = NumberFormatException.class)
    public void convert_from_string_to_integer_should_fail_with_string() {
        IntegerConverter converter = new IntegerConverter();
        converter.toInteger("TEST");
    }
}
