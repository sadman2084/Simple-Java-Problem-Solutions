public class signed_unsigned {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        System.out.println(a + " " + b + " ");
        int c = Integer.compare(a, b);
        System.out.println(c);
        int d = Integer.compareUnsigned(a, b);
        System.out.println(d);
    }
}
