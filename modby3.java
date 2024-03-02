public class modby3 {
    public static void main(String[] args) {
        int x, y, p = 20;
        int count = 0;
        for (x = 5; x <= p; x++) {
            if (x % 3 == 0) {
                // System.out.print(x + " ");
                count++;
            }
        }
        System.out.println(count);
    }
}
