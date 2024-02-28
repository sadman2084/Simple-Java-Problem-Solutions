import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        int i;
        int count = 0;
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for (i = 2; i < a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
