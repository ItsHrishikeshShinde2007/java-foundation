import java.util.Scanner;
public class Strings 
{
    public static void main(String[] args)
    {
        Scanner driver = new Scanner(System.in);
        String newd;
        System.out.println("Please name the best driver of the F1 on the grid: ");
        newd = driver.nextLine();
        System.out.print(newd + "\n");
        System.out.println("Your string has " + newd.length() + " characters");
        System.out.println(newd.toUpperCase());
        System.out.println(newd.toLowerCase());
        System.out.print("The 4th character of your string is: ");
        System.out.println(newd.charAt(4));
        for(int i = 0; i < newd.length(); i++)
        {
            System.out.print(newd.charAt(i));
        }
        System.out.println("\n");
        for(int i = 0; i < newd.length(); i++)
        {
            System.out.println(newd.charAt(i));
        }
        if(newd.equals("Max Verstappen"))
        {
            System.out.println("Simply Lovely");
        }
        else
        {
            System.out.println("If driver is not Max then you are out");
        }
        driver.close();
    }
}