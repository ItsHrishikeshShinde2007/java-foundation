import java.util.Scanner;

public class NestedLoops
{
    public static void square()
    {
        System.out.println("Square: ");
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightAngleTriangle()
    {
        System.out.println("Right angle triangle: ");
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rectangle()
    {
        System.out.println("Rectangle: ");
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 10; j++)
            {
                    System.out.print("* ");
            }
                System.out.println();
            }
        }
    public static void main(String[] args)
    {
        System.out.println("Nested loops in Java:");
        while (true)
        {
            Scanner shape = new Scanner(System.in);
            System.out.println("***Shape generator***");
            System.out.println("Choose a shape to generate:");
            System.out.println("a. Square");
            System.out.println("b. Right angle triangle");
            System.out.println("c. Rectangle");
            System.out.println("d. Exit");
            char choice = shape.next().charAt(0);
            switch (choice)
            {
                case 'a':
                    square();
                    break;
                case 'b':
                    rightAngleTriangle();
                    break;
                case 'c':
                    rectangle();
                    break;
                case 'd':
                    System.out.println("Simply lovely");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }  
    }
}
