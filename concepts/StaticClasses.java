import java.util.Scanner;

class Driver
{
    String name;
    String team;
    int number;
}
public class StaticClasses
{

    public static void showdriver1(Driver driver1)
    {
        System.out.println();
        System.out.println("Driver name: " + driver1.name);
        System.out.println("Driver team: " + driver1.team);
        System.out.println("Driver number: " + driver1.number);
    }

    public static void showdriver2(Driver driver2)
    {
        System.out.println();
        System.out.println("Driver name: " + driver2.name);
        System.out.println("Driver team: " + driver2.team);
        System.out.println("Driver number: " + driver2.number);
    }

    public static void showdriver3(Driver driver3)
    {
        System.out.println();
        System.out.println("Driver name: " + driver3.name);
        System.out.println("Driver team: " + driver3.team);
        System.out.println("Driver number: " + driver3.number);
    }

    public static void showdriver4(Driver driver4)
    {
        System.out.println();
        System.out.println("Driver name: " + driver4.name);
        System.out.println("Driver team: " + driver4.team);
        System.out.println("Driver number: " + driver4.number);
    }

    public static void addDriver(Scanner main,Driver driver1, Driver driver2, Driver driver3, Driver driver4)
    {
        System.out.println("Please state the name of the driver that you want to add: ");
        driver4.name = main.nextLine();
        System.out.println("Please state the team of the driver that you want to add: ");
        driver4.team = main.nextLine();
        System.out.println("Please state the number of the driver that you want to add: ");
        driver4.number = main.nextInt();
        showdriver1(driver1);
        showdriver2(driver2);
        showdriver3(driver3);
        showdriver4(driver4);        
    }
    public static void main(String[] args)
    {
        Scanner main = new Scanner(System.in);

        Driver driver1 = new Driver();
        driver1.name = "Max Verstappen";
        driver1.team = "Red Bull Racing Team";
        driver1.number = 1;

        Driver driver2 = new Driver();
        driver2.name = "Lewis Hamilton";
        driver2.team = "Mercedese AMG Formula One team";
        driver2.number = 44;

        Driver driver3 = new Driver();
        driver3.name = "Charles Leclerc";
        driver3.team = "Scuderia Ferrari";
        driver3.number = 16;

        Driver driver4 = new Driver();
        driver4.name = "";
        driver4.team = "";
        driver4.number = 0;

        System.out.println("Welcome to the Classes file");
        System.out.println("We will use Classes here to display all the different stats of drivers");
        System.out.println("List of drivers and their stats are as follows:- ");
        showdriver1(driver1);
        showdriver2(driver2);
        showdriver3(driver3);

        System.out.println("Now would you want to add any new driver, or leave it as is?");
        char choice = main.nextLine().charAt(0);
        switch (choice) 
        {
            case 'Y':
            case 'y':
                addDriver(main, driver1, driver2, driver3, driver4);
            break;

            case 'N':
            case 'n':
                showdriver1(driver1);
                showdriver2(driver2);
                showdriver3(driver3);
                System.out.println("Simply Lovely");
                main.close();
            break;
        
            default:
                System.out.println("That will not work choose either yes or no. ('Y'/'N')");
            break;


        }
    }
}