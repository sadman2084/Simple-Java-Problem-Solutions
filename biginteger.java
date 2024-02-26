//finding big integer
import java.math.BigInteger;

public class biginteger {
    public static void main(String[] args) {
        BigInteger bigval = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println("\nBigInteger value: " + bigval);
        long val_Long = bigval.longValue();
        System.out.println("\nConvert the said BigInteger to a long value: " + val_Long);
        int val_Int = bigval.intValue();
        System.out.println("\nConvert the said BigInteger to an int value: " + val_Int);
        short val_Short = bigval.shortValue();
        System.out.println("\nConvert the said BigInteger to a short value: " + val_Short);
        byte val_Byte = bigval.byteValue();
        System.out.println("\nConvert the said BigInteger to byte: " + val_Byte);
        long val_ExactLong = bigval.longValueExact();
        System.out.println("\nConvert the said BigInteger to exact long: " + val_ExactLong);
    }
}
