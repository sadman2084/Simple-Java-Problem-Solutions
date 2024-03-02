import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        int i, j, r;
        Scanner in = new Scanner(System.in);
        r = in.nextInt();
        for (i = 1; i <= r; i++) {
            // space
            for (j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (j = i; j >= 1; j--) {
                System.out.printf("%c", j + 64);
            }
            for (j = 2; j <= i; j++) {
                System.out.printf("%c", j + 64);
            }

            System.out.println();
        }

    }
}