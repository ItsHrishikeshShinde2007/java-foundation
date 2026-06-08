import java.util.Scanner;

public class Strings
{
    public static void main(String[] args)
    {
        Scanner driver = new Scanner(System.in);
        System.out.println("This program is all about strings, So lets start");
        String input;
        System.out.print("Please enter a name of a F1 driver: ");
        input = driver.nextLine();
        System.out.println("Ok so you entered: " + input + " that is a good pick\n");
        System.out.println("Alright now lets play with this string, like how about identifying the length of the string you entered\n");
        System.out.println("Ok so the function says that the size of string that you entered is " + input.length() + " \n");
        System.out.println("Ok that was fun, now what if we try to change the string you entered to all uppercase letters\n");
        System.out.println("Ok so if all the elements of the string that you entered if flipped to uppercase will look like, " + input.toUpperCase() + "\n");
        System.out.println("Ok that was fun, now what if we try to change the string you entered to all lowercase letters\n");
        System.out.println("Ok so if all the elements of the string that you entered if flipped to lowercase will look like, " + input.toLowerCase() + "\n");
        System.out.println("Oh damn i forgot to even read the name itself i just started using function itself, ok so the name you entered is " + input + "\n");
        if(input.toUpperCase().equals("MAX VERSTAPPEN") || input.toUpperCase().equals("MAX"))
        {
            System.out.println("Oh damn you entered the name of the GOAT, Max Verstappen, that is a good pick, Simply lovely");
        }
        else
        {
            System.out.println("Oh damn, you entered the name of " + input + " that is a good pick maybe for you but not as good as Max Verstappen");
        }
        driver.close();
    }
}