public class encap {
    public static void main(String[] args) {
        student john = new student();
        System.out.println(john.getid());
        john.setid(1038213);
        System.out.println(john.getid());
    }
}
class student{
    private int id =  12345;
    public String name = "John Joeson";
    int getid(){
        return id;
    }
    void setid(int newid){
        id = newid;
    }
}