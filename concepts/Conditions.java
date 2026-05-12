import java.util.Scanner;

public class Conditions
{
    public static void main(String[] args)
    {
        Scanner driver = new Scanner(System.in);
        System.out.println("Rate Max verstappen out of 10: ");
        int x = driver.nextInt();
        System.out.println("Rate Lewis Hamilton out of 10: ");
        int y = driver.nextInt();

        System.out.println("Ok first i see whether you rated them same or different, then i will see how much you rated them");
        if(x == y)
        {
            System.out.println("Ok so you feel they both are same, but we all know Max is better than Lewis");
        }
        else
        {
            System.out.println("Ok so you have rated them different, thats interesting, lets see how you rated them");
        }

        System.out.println("Analyzing Max's rating...");
        if(x > 0)
        {
            if(x >= 8)
            { 
                System.out.println("Ok, so you rated Max " + x + ", I think we are gonna be good friends");
            }
            else
            {
                System.out.println("You do realize that Max deserves more than " + x + " right?, You dont look like a true F1 fan to me");
            }
        }
        else if( x < 0 )
        {
            System.out.println("You know what?, just get out of here, you dont deserve to be here, you are not a true F1 fan");
        }
        else
        {
            System.out.println("how can you rate Max 0 out of 10, you must be joking, get out of here, you are not a true F1 fan");
        }

        System.out.println("Analyzing both ratings again... ");
        if(x > y)
        {
            System.out.println("Ok so you rated Max higher than Lewis, thats good, we can be good friends mate");
        }
        else if(x < y)
        {
            System.out.println("Ok so you rated Lewis higher than Max, thats not good, We might not be good friends mate");
        }
        else
        {
            System.out.println("Ok so you rated them both the same, but we all know Max is better than Lewis");
        }
        driver.close();
    }
}
