public class strfunctions {
    public static void main(String[] args) {
        String first = "Codi";
        String second = "ngal";
        String lower = "codingal";
        String higher = lower.toUpperCase();
        int length = lower.length();
        String concat = first+second;

        System.out.println(first);
        System.out.println(second);
        System.out.println(concat);
        System.out.println(lower);
        System.out.println(higher);
        System.out.println(length);
    }
}
