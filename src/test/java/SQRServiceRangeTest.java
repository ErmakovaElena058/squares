import org.example.squaresmvn.services.SQRServiceRange;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceRangeTest {
    @Test

    public void shouldCalcExact() {
        SQRServiceRange service = new SQRServiceRange();

        long expected = 3;
        long actual = service.calcSqrt(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldCalcZero() {
        SQRServiceRange service = new SQRServiceRange();

        long expected = 0;
        long actual = service.calcSqrt(0, 0);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldCalcThreehundred() {
        SQRServiceRange service = new SQRServiceRange();

        long expected = 0;
        long actual = service.calcSqrt(300, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldCalcConversely() {
        SQRServiceRange service = new SQRServiceRange();

        long expected = 0;
        long actual = service.calcSqrt(300, 200);

        Assertions.assertEquals(expected, actual);
    }
}