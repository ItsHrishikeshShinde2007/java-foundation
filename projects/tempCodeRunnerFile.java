import java.util.Scanner;

public class DuplicateRemover
{
    public static void main(String[] args)
    {
        Scanner names = new Scanner(System.in);
        System.out.println("+++ Welcome to Duplicate remover software +++");
        System.out.println("So. we shall start with first tell me how many drivers do you like: ");
        int number = names.nextInt();
        names.nextLine();
        String[] drivers = new String[number];
        String[] uniqueDrivers = new String[number];
        int uniqueCount = 0;
        for (int i = 0; i < number; i++)
        {
            System.out.println("Ok so list the name of " + (i + 1) + " driver :");
            drivers[i] = names.nextLine();
        }

        System.out.println("Ok do the name you have given are as follows");
        for (int i = 0; i < number; i++)
        {
            System.out.println("Driver number " + (i + 1) + " " + drivers[i]);
        }
        for (int i = 0; i < number; i++)
        {
            boolean repeatedDriver = false;
            for (int j = 0; j < uniqueCount; j++)
            {
                if (drivers[i].equals(uniqueDrivers[j]))
                {
                    repeatedDriver = true;
                    break;
                }
            }
            if (!repeatedDriver)
            {
                uniqueDrivers[uniqueCount] = drivers[i];
                uniqueCount++;
            }
        }
        System.out.println("Unique drivers are:");

        for(int i = 0; i < uniqueCount; i++)
        {
            System.out.println(uniqueDrivers[i]);
        }
        names.close();
    }
}
