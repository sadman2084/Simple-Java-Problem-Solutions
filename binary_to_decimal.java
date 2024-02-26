//convert binary t decimal
import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int binary;
        binary = input.nextInt();
        int r;
        int decimal = 0;
        int j = 1;
        while (binary != 0) {
            r = binary % 10;
            decimal = decimal + r * j;
            j = j * 2;
            binary = binary / 10;
        }
        System.out.println(decimal);
    }
}
