import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyConverter {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Another statement");
    }

    public BigDecimal convert(BigDecimal originalAmount, BigDecimal conversionRate) {
        BigDecimal result = originalAmount.multiply(conversionRate);
        return result.setScale(2, RoundingMode.HALF_UP);
    }

}
