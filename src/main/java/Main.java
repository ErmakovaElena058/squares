import org.example.squaresmvn.services.SQRServiceRange;

public class Main {

    public static void main(String[] args) {
        SQRServiceRange service = new SQRServiceRange();
        long i = service.calcSqrt(200, 300);
        System.out.println(i);

    }
}
