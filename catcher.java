import java.util.ArrayList;

public class catcher {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<String>();
        numbers.add("bob");
        numbers.add("mike");
        numbers.add("john");

        numbers.forEach((x) -> {System.out.println(x);});
        numbers.forEach(n -> {if (n == "john") System.out.println("john Found");});
    }   
}

