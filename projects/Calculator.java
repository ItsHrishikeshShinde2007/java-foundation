import java.util.Scanner;

public class Calculator
{
    public static void start(Scanner driver)
    {
        while(true)
        {
            System.out.println("=== Calculator ===");
            System.out.println("1. Continue");
            System.out.println("2. Close");

            int menu = driver.nextInt();

            if(menu == 2)
            {
                System.out.println("Simply lovely");
                return;
            }

            System.out.println("Enter the first number:");
            double num1 = driver.nextDouble();

            System.out.println("Enter operator (+, -, *, /, ^):");
            String operator = driver.next();

            System.out.println("Enter the second number:");
            double num2 = driver.nextDouble();

            if(operator.equals("+"))
            {
                System.out.println("Result = " + (num1 + num2));
            }

            else if(operator.equals("-"))
            {
                System.out.println("Result = " + (num1 - num2));
            }

            else if(operator.equals("*"))
            {
                System.out.println("Result = " + (num1 * num2));
            }

            else if(operator.equals("/"))
            {
                if(num2 == 0)
                {
                    System.out.println("Division by zero is not possible");
                }

                else
                {
                    System.out.println("Result = " + (num1 / num2));
                }
            }

            else if(operator.equals("^"))
            {
                System.out.println("Result = " + Math.pow(num1, num2));
            }

            else
            {
                System.out.println("Invalid operator");
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner driver = new Scanner(System.in);
        start(driver);
    }
}