import java.util.Scanner;

public class StringInArray
{
    public static void main(String[] args)
    {
        Scanner names = new Scanner(System.in);
        System.out.println("+++ Welcome to Duplicate remover software +++");
        System.out.println("So. we shall start with first tell me how mant drivers do you like: ");
        int number = names.nextInt();
        names.nextLine();
        String[] drivers = new String[number];
        for (int i = 0; i < number; i++)
        {
            System.out.println("Ok so list the name of " + (i + 1) + " driver :");
            drivers[i] = names.nextLine();
        }
        System.out.println("Ok do the name you have given are as follows");
        for (int i = 0; i < number; i++)
        {
            System.out.println("Driver number " + i + 1 + " " + drivers[i]);
        }
        names.close();
    }
}
