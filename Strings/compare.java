public class compare {
    public static void main(String args[])
    {
        String fruits[] = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        String l = fruits[0];
        for(int i=1;i<fruits.length;i++)
        {
            if(fruits[i].compareToIgnoreCase(l)> 0)
            {
                l = fruits[i];
            }
        }
        System.out.println("Largest fruit name: " + l);
        System.out.println("Length of largest fruit name: " + l.length());

    }
}
