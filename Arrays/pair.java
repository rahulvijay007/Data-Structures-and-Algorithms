public class pair {
    public static void pairs(int n[])
    {
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                System.out.print("(" + n[i] + "," + n[j] + ") ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " + count);
    }
    public static void main(String[] args) {
        int n[] = {1, 2, 3, 4, 5};
        pairs(n);
    }
}
