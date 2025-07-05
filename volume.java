public class volume {
    public static void main(String[] args) {
        //System.out.println("pluh");
        cube jerry = new cube();
        jerry.setlength(15);
        jerry.getvolume();
    }
}

class cube{
    int length;
    void setlength(int size){
        length = size;
    }
    void getvolume(){
        System.out.println(Math.floor(Math.pow(length, 3) * 100) / 100);
    }
}