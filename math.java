import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n,s;
        n=in.nextDouble();
        s=in.nextDouble();
        double area=(n*s*s)/(4*Math.tan(Math.PI/n));
        System.out.println(area);
        
    }
}
