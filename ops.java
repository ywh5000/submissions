public class ops {
    public static void main (String[] args){
        int x = 10;
        int y = 5;
        
        System.out.println("Unary Operators:");
        System.out.println(x++);
        System.out.println(++y);
        x = 10;
        y = 5;
        System.out.println("Binary Operators");
        System.out.println((x+y));
        System.out.println((x-y));
        System.out.println((x*y));
        System.out.println((x/y));

        System.out.println("Ternary Operators");
        System.out.println((x>y)?x:y);
    }
}
