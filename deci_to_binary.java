import java.util.Scanner;

public class deci_to_binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal;
        decimal = scanner.nextInt();
        int i ;
        int q;
        q = decimal;
        int[] binary = new int[200];
        for (i = 0; q != 0; i++) {
            binary[i] = q % 2;
            q = q / 2;
        }
        int j;
        for (j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]);
        }
    }
}
