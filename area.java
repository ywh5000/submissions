public class area {
    public static void main(String[] args) {
        square squohn = new square();
        triangle trianne = new triangle();

        System.out.println(squohn.getarea(5));
        System.out.println(trianne.getarea(10,15));
    }
}

class shape{
    double getarea(){
        return 0.0;
    }
}

class triangle extends shape{
    double getarea(int base, int height){
        return (base*height)/2;
    }
}

class square extends shape{
    double getarea(int sidelength){
        return sidelength*sidelength;
    }
}