import java.util.Scanner;

public class binaryadd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long b1, b2;
        long r = 0;
        int i = 0;
        long[] sum = new long[200];
        b1 = input.nextLong();
        b2 = input.nextLong();
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
        while (i > 0) {
            System.out.print(sum[--i]);
        }
        System.out.println("\n");
    }
}
