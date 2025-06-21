public class abstraction {
    public static void main(String[] args) {
        Objects cubey = new cube();
        Objects prismy = new prism();
        Objects cuboidy = new cuboid();

        cubey.show();
        prismy.show();
        cuboidy.show();
    }
}

abstract class Objects{
    abstract void show();
    void shape(){
        System.out.println("i'm shape");
    }
}

class cube extends Objects{
    void show(){
        System.out.println("I.... am cube.");
    }
}

class prism extends Objects{
    void show(){
        System.out.println("I.... am prism.");
    }
}

class cuboid extends Objects{
    void show(){
        System.out.println("I.... am cuboid.");
    }
}
