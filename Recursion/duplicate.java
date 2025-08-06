import java.util.HashMap;
import java.util.HashSet;

public class duplicate {

    public static void main(String[] args) {
        String input = "programming";
        input = input.toLowerCase(); // optional

        // Step 1: Find duplicates using recursion
        HashMap<Character, Integer> countMap = new HashMap<>();
        countCharacters(input, 0, countMap);

        System.out.println("Duplicate characters:");
        for (char c : countMap.keySet()) {
            if (countMap.get(c) > 1) {
                System.out.println(c + " (count: " + countMap.get(c) + ")");
            }
        }

        // Step 2: Build new string without duplicates (keep first occurrence only)
        HashSet<Character> seen = new HashSet<>();
        String updated = removeDuplicatesRecursive(input, 0, seen);

        System.out.println("Updated string without duplicates: " + updated);
    }

    // Recursive method to count character occurrences
    public static void countCharacters(String str, int index, HashMap<Character, Integer> map) {
        if (index >= str.length()) return;

        char current = str.charAt(index);
        map.put(current, map.getOrDefault(current, 0) + 1);

        countCharacters(str, index + 1, map);
    }

    // Recursive method to remove duplicate characters
    public static String removeDuplicatesRecursive(String str, int index, HashSet<Character> seen) {
        if (index >= str.length()) return "";

        char current = str.charAt(index);
        if (seen.contains(current)) {
            return removeDuplicatesRecursive(str, index + 1, seen);
        } else {
            seen.add(current);
            return current + removeDuplicatesRecursive(str, index + 1, seen);
        }
    }
}
