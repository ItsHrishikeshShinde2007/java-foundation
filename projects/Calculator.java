import java.util.Scanner;

public class Calculator
{
    public static void main(String[] arg)
    {
        Scanner S1 = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = S1.nextDouble();
        
        System.out.println("State the operator (+, -, *, /, ^): ");
        String operator = S1.next();

        System.out.println("Enter the second number: ");
        double num2 = S1.nextDouble();
        
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

        S1.close();
    }
}