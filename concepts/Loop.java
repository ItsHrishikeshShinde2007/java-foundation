public class Loop
{
    public static void main(String[] args)
    {
        int i = 0;
        System.out.println("Table of 5 is:");
        while(i <=10)
        {
            System.out.println( " 5  * " + i + " = " + (5*i));
            i++;
        }

        System.out.println("Max verstappen is :");
        for(int j = 0; j <= 4; j++)
        {
            System.out.println(j + "?");
            if(j == 4)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
        int j = 4;
        System.out.println( j + " times world champion");
    }
}