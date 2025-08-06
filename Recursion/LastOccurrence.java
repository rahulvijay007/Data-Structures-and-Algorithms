public class LastOccurrence {
    public static int lastPresent(int a[], int i, int key) {
        if (i == a.length) // base case: end of array
            return -1;

        // Recursively check in the rest of the array first
        int restIndex = lastPresent(a, i + 1, key);

        // If found in rest of array, return that
        if (restIndex != -1)
            return restIndex;

        // Otherwise, check current index
        if (a[i] == key)
            return i;

        return -1; // not found
    }

    public static void main(String args[]) {
        int a[] = {1, 2, 5, 4, 5, 6, 5, 8, 9};
        int key = 5;
        int result = lastPresent(a, 0, key);
        if (result != -1)
            System.out.println("Last occurrence at index: " + result);
        else
            System.out.println("Element not found");
    }
}
