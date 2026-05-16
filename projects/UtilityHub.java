import java.util.Scanner;

public class UtilityHub
{
    public static void main(String[] args)
    {
        Scanner util = new Scanner(System.in);
        while(true)
        {
            System.out.println("=== UTILITY HUB ===");
            System.out.println("1. Calculator");
            System.out.println("2. F1-driver Stats");
            System.out.println("3. Grade System");
            System.out.println("4. Exit");
            System.out.println("Please enter your choice");
            int choice = util.nextInt();
            switch(choice)
            {
                case 1:
                    Calculator.main(null);
                    break;
                case 2:
                    Stats.main(null);
                    break;
                case 3:
                    GradeSystem.main(null);
                    break;
                case 4:
                    System.out.println("Exiting Utility Hub...");
                    util.close();
                    return;
                default:
                    System.out.println("Invalud choice please try again");
            }
        }
    }
}
