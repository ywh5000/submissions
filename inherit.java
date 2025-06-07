public class inherit {
    public static void main(String[] args) {
        student student1 = new student();
        student1.naming("bob");
        student1.sayage(2);

        babylion frank = new babylion();
        frank.eat("generic food");
        frank.roar();
        frank.cry();

        cheetah c = new cheetah();
        bear b = new bear();
        tiger t = new tiger();
        mammal john = new mammal();

        john.drink();
        t.hunt();
        b.fish("salmon");
        c.run();


    }
}

class parent {
    int age = 11;
    String name = "";
    void naming(String name){
        System.out.println("Hello i am "+name);
    }
}

class student extends parent{
    void sayage(int age){
        System.out.println("I am "+age);
    }
}

class animal{
    void eat(String food){
        System.out.println("mmm eat eat yum delicious food mm i love "+food+" (animal class)");
    }
}

class lion extends animal{
    void roar(){
        System.out.println("rahhghgh (lion)");
    }
}

class babylion extends lion{
    void cry(){
        System.out.println("wahh (baby)");
    }
}

class mammal{
    void eat(String food){
        System.out.println("mmm eat eat yum delicious food mm i love "+food+" (mammal class)");
    }
    void drink(){
        System.out.println("sip");
    }
}

class cheetah extends mammal{
    void run(){
        System.out.println("yes running wow (cheetah)");
    }
}

class bear extends mammal{
    void fish(String fish){
        System.out.println("cool i just caught a "+fish);
    }
}

class tiger extends mammal{
    void hunt(){
        System.out.println("i just caught this cool thing!!!");
    }
}