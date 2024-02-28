import java.util.Scanner;

public class deci_to_hexa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = scanner.nextInt();
        int i = 0;
        char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        String hexa="";
        int r;

        while (decimal != 0) {
            r = decimal % 16;
            hexa = hex[r] + hexa;
            decimal = decimal / 16;
        }
        System.out.println(hexa);
    }
}
