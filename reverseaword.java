import java.util.Scanner;

public class reverseaword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        int i;
        for (i = a.length()-1; i >= 0; i--) {
            System.out.print(a.charAt(i));
        }

    }
}
