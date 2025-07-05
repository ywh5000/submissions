
import java.util.Scanner;



public class bank {
    public static void main(String[] args) {
        boolean welcomepage = true;
        String[] names = new String[10];
        names[0] = "joe";
        double[] balance = new double[10];
        balance[0] = 50;
        Scanner sc = new Scanner(System.in);
        int choice;

        while (welcomepage){
            System.out.println("1: Change Name");
            System.out.println("2: Check Balance");
            System.out.println("3: Add Customer");
            System.out.println("4: Update Balance");
            System.out.println("5: Summary");
            System.out.println("6: Quit");

            System.out.println("");

            System.out.println("Enter a number to proceed");
            choice = sc.nextInt();
            if (choice == 1){
                names[0] = sc.next();
                System.out.println("New name is "+names[0]);
            }
            if (choice == 2){
                System.out.println(balance[0]);
            }
            if (choice == 3){
                System.out.println("Name:");
                names[1] = sc.next();
                System.out.println("Balance: ");
                balance[1] = sc.nextInt();
                System.out.println("New User named "+names[1]+" and has a balance of "+balance[1]);
            }
            if (choice == 4){
                System.out.println("Which user?");
                balance[sc.nextInt()] = sc.nextInt();
                System.out.println("New Balance is "+names[sc.nextInt()]);
            }
            if (choice == 5){
                for (int i = 0; i < names.length; i++){
                    System.out.println("Name:"+names[i]);
                    
                    System.out.println("Balance: "+balance[i]);
                    
                }
            }
            if (choice == 6){
                System.out.println("ok");
                System.out.println("");
            }

            welcomepage = false;
        }
    }
}
