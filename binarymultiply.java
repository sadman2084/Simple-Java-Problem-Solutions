import java.util.Scanner;

public class binarymultiply {
    static long bp(long b1, long b2) {
        int i = 0;
        long[] sum = new long[20];
        long r = 0;
        long binary=0;
        while (b1 != 0 || b2 != 0) {
            sum[i] = (b1 % 10 + b2 % 10 + r) % 2;
            r = (b1 % 10 + b2 % 10 + r) / 2;
            b1 = b1 / 10;
            b2 = b2 / 10;
            i++;
        }
        if (r != 0) {
            sum[i] = r;
            i++;
        }
        while (i>0) {
            binary = binary * 10 + sum[i--];
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long b1, b2;
        b1 = input.nextLong();
        b2 = input.nextLong();
        long multiply = 0, factor = 1, digit;
        while (b2 != 0) {
            digit = b2 % 10;
            if (digit == 1) {
                b1 = b1 * factor;
                multiply = bp(b1, multiply);
            } else {
                b1 = b1 * factor;
            }
            b2 = b2 / 10;
            factor = 10;
        }
        System.out.println(multiply);
    }
}
