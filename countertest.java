class counter {
    int num = 10;
    static int statnum = 10;

    public void increment() {
        num = num + 1;
        //statnum = statnum++;
        System.out.println(num);
    }

}
public class countertest{
   public static void main(String[] args) {
       counter count1 = new counter();
       //counter count2 = new counter();

       count1.increment();
       //count2.increment(args);

       //System.out.println(count1.num);
       //System.out.println(count2.num);
   } 
}