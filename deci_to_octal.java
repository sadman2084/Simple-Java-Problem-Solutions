import java.util.Scanner;

public class deci_to_octal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decimal;
        decimal = input.nextInt();
        int q;
        q = decimal;
        int[] octal = new int[100];
        int i;
        for (i = 0; q != 0; i++) {
            octal[i] = q % 8;
            q = q / 8;
            
        }
        int j;
        for (j = i - 1; j >= 0; j--) {
            System.out.print(octal[j]);
        }
    }
}
