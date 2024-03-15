import java.util.Scanner;

public class stringreverse {
    public static void main(String[] args) {
        //String[] arr=new String[1000];
        String arr;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        arr=scanner.nextLine();
        int i=0;
        for(i=arr.length()-1;i>=0;i--)
        {
            System.out.print(arr.charAt(i));
        }

    }
}
