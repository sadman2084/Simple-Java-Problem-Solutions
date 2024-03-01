public class min_to_year {
    public static void main(String[] args) {
        double min = 3456789;
        double year = min / (60 * 24 * 365);
        System.out.println(year);
        double a = year - (int) year ;
        int b=(int)(a*365);
        System.out.println(b);
    }
}
