public class subarrays {
    public static void Subarrays(int n[]) {
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = i; j < n.length; j++) {
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(n[k] + " ");
                }
                System.out.print("] ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total subarrays: " + count);
    }

    public static void main(String[] args) {
        int n[] = {1, 2, 3, 4, 5};
        Subarrays(n);
    }
}