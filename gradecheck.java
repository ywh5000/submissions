
import java.util.Scanner;

public class gradecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 3 subjects. ");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        float percent = (sub1+sub2+sub3)/3;
        System.out.println(percent);
        if (percent > 95){
                System.out.println("You got an O!!! (yay?)");
        }
        if (percent > 90){
                System.out.println("You got an A+!!! (yay!!)");
        }
        else{
            System.out.println("You passed?? (woohoo)");
        }

    }
}
