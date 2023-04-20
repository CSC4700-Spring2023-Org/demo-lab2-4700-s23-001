import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CurrencyConverterTest {

    @BeforeEach
    void setUp() throws Exception {
    }

    @Test
    void testConvertBasic() {
        CurrencyConverter converter = new CurrencyConverter();
        BigDecimal originalAmount = BigDecimal.valueOf(100.00);
        BigDecimal conversionRate = BigDecimal.valueOf(2.70);
        BigDecimal expectedAmount = BigDecimal.valueOf(270.00).setScale(2);
        BigDecimal convertedAmount = converter.convert(originalAmount, conversionRate);
        //expected, actual
        assertEquals(expectedAmount, convertedAmount);
    }

    @Test
    void testConvertRounding() {
        CurrencyConverter converter = new CurrencyConverter();
        BigDecimal originalAmount = BigDecimal.valueOf(99.99);
        BigDecimal conversionRate = BigDecimal.valueOf(2.70);
        BigDecimal expectedAmount = BigDecimal.valueOf(269.97).setScale(2);
        BigDecimal convertedAmount = converter.convert(originalAmount, conversionRate);
        assertEquals(expectedAmount, convertedAmount);
    }    
    
}





