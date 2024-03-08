import java.util.Scanner;

public class reverseofnumber {
    public static void main(String[] args) {
        int i;
        Scanner in = new Scanner(System.in);
        int num;
        int sum = 0;
        num = in.nextInt();
        int r;
        for (i = 1; num != 0; i++) {
            r = num % 10;
            sum = sum*10 + r;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
