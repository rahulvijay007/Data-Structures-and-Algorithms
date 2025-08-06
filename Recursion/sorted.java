public class sorted {
    public static boolean issorted(int a[], int i) {
        if(i == a.length - 2)   // Base case
            return true;
        
        if(a[i] > a[i + 1])     // If current element is greater than next
            return false;
        
        return issorted(a, i + 1);  // Recursive call
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        System.out.println(issorted(a, 0)); // Should print true

        int b[] = {1, 3, 2, 4, 5};
        System.out.println(issorted(b, 0)); // Should print false
    }
}

    
