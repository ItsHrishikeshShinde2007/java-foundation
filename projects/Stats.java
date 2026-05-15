import java.util.Scanner;
public class Stats
{
    public static void MaxStats(Scanner driver)
    {
        System.out.println("=+=+=+Stats Menu +=+=+=");
        System.out.println("1. Championship");
        System.out.println("2. Wins");
        System.out.println("3. Podiums");
        System.out.println("4. Team");
        System.out.println("5. return");
        int stat = driver.nextInt();
        switch (stat)
        {
            case 1:
                System.out.println("Championships = 4");
                break;
            case 2:
                System.out.println("Wins = 71");
                break;
            case 3:
                System.out.println("Podiums = 127");
                break;
            case 4:
                System.out.println("Team = Red Bull Racing");
                break;
            case 5:
                System.out.println("Returning to the Driver selection");
                return;
            default:
               System.out.println("Invalid choice!");
         }
    }
    public static void LewStats(Scanner driver)
    {
        System.out.println("=+=+=+Stats Menu +=+=+=");
        System.out.println("1. Championship");
        System.out.println("2. Wins");
        System.out.println("3. Podiums");
        System.out.println("4. Team");
        System.out.println("5. return");
        int stat = driver.nextInt();
        switch (stat)
        {
            case 1:
                System.out.println("Championships = 7");
                break;
            case 2:
                System.out.println("Wins = 105");
                break;
            case 3:
                System.out.println("Podiums = 203");
                break;
            case 4:
                System.out.println("Team = Ferrari");
                break;
            case 5:
                System.out.println("Returning to the Driver selection");
                return;
            default:
               System.out.println("Invalid choice!");
         }        
    }
    public static void SebStats(Scanner driver)
    {
        System.out.println("=+=+=+Stats Menu +=+=+=");
        System.out.println("1. Championship");
        System.out.println("2. Wins");
        System.out.println("3. Podiums");
        System.out.println("4. Team");
        System.out.println("5. return");
        int stat = driver.nextInt();
        switch (stat)
        {
            case 1:
                System.out.println("Championships = 4");
                break;
            case 2:
                System.out.println("Wins = 53");
                break;
            case 3:
                System.out.println("Podiums = 122");
                break;
            case 4:
                System.out.println("Team = Aston Martin");
                break;
            case 5:
                System.out.println("Returning to the Driver selection");
                return;
            default:
               System.out.println("Invalid choice!");
         }
    }
    public static void SenStats(Scanner driver)
    {
        System.out.println("=+=+=+Stats Menu +=+=+=");
        System.out.println("1. Championship");
        System.out.println("2. Wins");
        System.out.println("3. Podiums");
        System.out.println("4. Team");
        System.out.println("5. return");
        int stat = driver.nextInt();
        switch (stat)
        {
            case 1:
                System.out.println("Championships = 3");
                break;
            case 2:
                System.out.println("Wins = 41");
                break;
            case 3:
                System.out.println("Podiums = 80");
                break;
            case 4:
                System.out.println("Team = McLaren");
                break;
            case 5:
                System.out.println("Returning to the Driver selection");
                return;
            default:
               System.out.println("Invalid choice!");
         }
    }
    public static void main(String[] args)
    {
        Scanner driver = new Scanner(System.in);
        while(true)
        {
        System.out.println("=-=-= F1 Driver Stats System =-=-=");
        System.out.println("State which Driver's Stats you wanna see");
        System.out.println("1. Max Verstappen");
        System.out.println("2. Lewis Hamilton");
        System.out.println("3. Sebastian Vettel");
        System.out.println("4. Ayrton Senna");
        System.out.println("5. Exit");
        int choice = driver.nextInt();
        switch (choice) 
            {
                case 1:
                    MaxStats(driver);
                    break;
                case 2:
                    LewStats(driver);
                    break;
                case 3:
                    SebStats(driver);
                    break;
                case 4:
                    SenStats(driver);
                    break;
                case 5:
                    System.out.println("Simply lovely");
                    driver.close();
                    return;
                default:
                   System.out.println("Invalid choice!");
            }
        }
    }
}