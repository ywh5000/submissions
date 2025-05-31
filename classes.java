public class classes {
    public static void main(String[] args) {
        employee.greet(args);
    }
}
class employee{
    public static void intro(String[] args) {
        System.out.println("********************");
        String name = "John";
        int empnum = 102;
        int sal = 25000;
    }
    public static void greet(String[] args) {
        
        String name = "John";
        int empnum = 102;
        int sal = 25000;
        System.out.println(name);
        System.out.println(empnum);
        System.out.println(sal);
    }
}
