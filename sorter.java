
import java.util.Arrays;

public class sorter {
    public static void main(String[] args) {
        int[] nums = {1, 7, 2, 4, 5, 3, 10, 9, 6, 8};
        System.out.println(Arrays.toString(nums));
        System.out.println("---------- Sorted ----------");
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
