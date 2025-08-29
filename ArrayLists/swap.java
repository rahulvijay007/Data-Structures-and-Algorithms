import java.util.ArrayList;
public class swap {
    public static void result(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        System.out.println("Before swap: " + numbers);
        result(numbers, 1, 3);
        System.out.println("After swap: " + numbers);
    }
    
}
