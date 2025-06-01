
import java.util.Scanner;

public class numreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse.");
        int number = sc.nextInt();
        while (number > 0) {
    System.out.print(number % 10);
    number = number / 10;
}
    }
}
