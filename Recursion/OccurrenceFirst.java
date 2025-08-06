public class OccurrenceFirst {
    public static int present(int a[], int i, int key) {
        if (i == a.length) // base case: index out of bounds
            return -1;
        if (a[i] == key)
            return i;
        return present(a, i + 1, key); // fix: return and correct argument order
    }

    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 5;
        int result = present(a, 0, key);
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}
