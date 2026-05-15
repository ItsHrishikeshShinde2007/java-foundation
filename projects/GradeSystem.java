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
    public static void main(String[] args)
    {
        Scanner points = new Scanner(System.in);
        System.out.println("+++ F1 Grade Scanner +++");
        System.out.println("Enter Your Marks: ");
        double marks = points.nextDouble();
        gradeSystem(marks);
        points.close();
    }
}