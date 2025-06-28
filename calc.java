public class calc {
    public static void main(String[] args) {
        add addfunc = new add();
        sub subfunc = new sub();
        mul mulfunc = new mul();
        div divfunc = new div();
        System.out.println(add.addition(16, 4));
        System.out.println(sub.subtraction(16, 4));
        System.out.println(mul.multiplication(16, 4));
        System.out.println(div.division(16, 4));
    }
}

class operation {
    void success() {
        System.out.println("Operation Success");
    }
}

class add extends operation{
    static int addition(int a, int b){
        return a+b;
    }
}

class sub extends operation{
    static int subtraction(int a, int b){
        return a-b;
    }
}

class mul extends operation{
    static int multiplication(int a, int b){
        return a*b;
    }
}

class div extends operation{
    static int division(int a, int b){
        return a/b;
    }
}