import org.example.squaresmvn.services.SQRServiceRange;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceRangeTest {

    @Test

    public void shouldCalcExact() {
        SQRServiceRange service = new SQRServiceRange();

        long expected = 225;
        long actual = service.calcSqrt(200, 300);

        Assertions.assertEquals(expected, actual);
    }
}