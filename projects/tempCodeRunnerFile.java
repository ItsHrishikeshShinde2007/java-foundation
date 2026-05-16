import java.util.Scanner;

public class Calculator
{

    public static void start(Scanner driver)
    {
        while(true)
        {
            System.out.println("Enter the first number: ");
            double num1 = driver.nextDouble();
        
            System.out.println("State the operator (+, -, *, /, ^): ");
            String operator = driver.next();

            System.out.println("Enter the second number: ");
            double num2 = driver.nextDouble();
        
            if (operator.equals("+")) 
            {
                System.out.println(Double.toString(num1 + num2));
            }

            if (operator.equals("-")) 
            {
                System.out.println(Double.toString(num1 - num2));
            }

            if (operator.equals("*")) 
            {
                System.out.println(Double.toString(num1 * num2));
            }

            if (operator.equals("/"))
            {
                if(num2 == 0)
                {
                    System.out.println("Division with 0 is not possible");
                }
                else
                {
                    System.out.println(Double.toString(num1 / num2));
                }
            }

            if(operator.equals("^"))
            {
                System.out.println(Double.toString(Math.pow(num1, num2)));
            }

            driver.close();
        }
    }

    public static void main(String[] arg)
    {
        Scanner driver = new Scanner(System.in);
        start(driver);
    }
}