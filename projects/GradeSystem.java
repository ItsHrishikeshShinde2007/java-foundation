import java.util.Scanner;

public class GradeSystem
{
    public static void gradeSystem (double points)
    {
        if(points < 0 || points > 100)
        {
            System.out.println("Invalid Choice");
        }
        else if(points >= 90)
        {
            System.out.println("World Champion");
        }
        else if(points >= 80)
        {
            System.out.println("Still a contender");
        }
        else if(points >= 60)
        {
            System.out.println("Podium Finisher");
        }
        else if(points >= 40)
        {
            System.out.println("Midfield");
        }
        else if (points >= 0)
        {
            System.out.println("Disaster Class");
        }
    }

    public static void start(Scanner driver)
    {
        while(true)
        {
        System.out.println("1. Continue");
        System.out.println("2. Exit");
        int choice = driver.nextInt();

        if(choice == 2)
        {
        return;
        }

        System.out.println("+++ F1 Grade Scanner +++");
        System.out.println("Enter Your Marks: ");
        double marks = driver.nextDouble();
        gradeSystem(marks);
        }        
    }
    public static void main(String[] args)
    {
        Scanner points = new Scanner(System.in);
        start(points);
    }
}