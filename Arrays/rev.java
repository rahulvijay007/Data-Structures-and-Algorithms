public class rev
{
    public static void reverse(int n[])
    {
        int start = 0;
        int end = n.length - 1;
        while (start < end)
        {
            int temp = n[start];
            n[start] = n[end];
            n[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[])
    {
        int num[] = {1, 2, 3, 4, 5};
        System.out.println("Original array:");
        for (int i = 0; i < num.length; i++)
        {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        reverse(num);
        System.out.println("Reversed array:");
        for (int i = 0; i < num.length; i++)
        {
            System.out.print(num[i] + " ");
        }
    }
}