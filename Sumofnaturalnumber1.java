public class Sumofnaturalnumber1
{
    public static void main(String[] args)
    {
        int num = 5, i = 1, sum = 0;
        while(i <= num)
        {

            sum = sum + i;
            i++;
        }
        System.out.println("Sum of First 5 Natural Numbers is = " + sum);
    }
}