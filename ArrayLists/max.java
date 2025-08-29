
import java.util.ArrayList;

public class max {
    public static int find(ArrayList <Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        int maxNumber = find(numbers);
        System.out.println("The maximum number in the list is: " + maxNumber);
    }
}
