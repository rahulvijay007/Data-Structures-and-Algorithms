import java.util.*;
public class sort {
    public static void result(ArrayList<Integer> arr) {
        Collections.sort(arr, Collections.reverseOrder()
        );
        System.out.println("Sorted Array: " + arr);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 2));
        System.out.println("Original Array: " + arr);
        result(arr);
    }
}
