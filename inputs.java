
import java.util.*;

public class inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your lucky number: ");
        int luckynum = sc.nextInt();
        System.out.println(name+", your lucky number "+luckynum+" means you are nice!!");
    }
}
