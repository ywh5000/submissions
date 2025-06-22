public class interfaces {
    public static void main(String[] args) {
        implement1 imp = new implement1();
        imp.method1();
        imp.method2();
    }
}

interface interfacetest{
    void method1();
    void method2();
}

class implement1 implements interfacetest{

    public void method1() {
        System.out.println("blah");
    }
    public void method2() {
        System.out.println("bleh");
    }
}

