import java.util.Scanner;

public class Classes
{
    String drivername;
    String teamname;
    int drivernumber;
    public static void main(String[] args)
    {
        Scanner data = new Scanner(System.in);
        System.out.println("This is the File that displays classes in Java");
        System.out.println("This classes is very similar to what i have learned in c as struct");
        
        Classes driver1 = new Classes();
        driver1.drivername = "Max Verstappen";
        driver1.teamname = "Red bull Racing";
        driver1.drivernumber = 3;

        Classes driver2 = new Classes();
        driver2.drivername = "Charles LecLerc";
        driver2.teamname = "Scuderia Ferrari";
        driver2.drivernumber = 16;

        Classes driver3 = new Classes();
        driver3.drivername = "Oscar Piastri";
        driver3.teamname = "McLaren Formula One Team";
        driver3.drivernumber = 81;

        Classes driver4 = new Classes();
        driver4.drivername = "";
        driver4.teamname = "";
        driver4.drivernumber = 0;

        System.out.println();
        System.out.println("Data of driver 1:");
        System.out.println("Name:  " + driver1.drivername);
        System.out.println("Team name:  " + driver1.teamname);
        System.out.println("Driver Number:  " + driver1.drivernumber);

        System.out.println();
        System.out.println("Data of driver 2:");
        System.out.println("Name:  " + driver2.drivername);
        System.out.println("Team name:  " + driver2.teamname);
        System.out.println("Driver Number:  " + driver2.drivernumber);


        System.out.println();
        System.out.println("Data of driver 3:");
        System.out.println("Name:  " + driver3.drivername);
        System.out.println("Team name:  " + driver3.teamname);
        System.out.println("Driver Number:  " + driver3.drivernumber);

        System.out.println("Do you want to add another new driver? (Y / N)");
        char choice = data.next().charAt(0);
        data.nextLine();

        if(choice == 'Y' || choice == 'y')
        {
            System.out.print("Ok then please state the new driver name: ");
            driver4.drivername = data.nextLine();
            System.out.print("Ok then please state the team name of the new driver: ");
            driver4.teamname = data.nextLine();
            System.out.print("Ok then please state the driver number: ");
            driver4.drivernumber = data.nextInt();

            System.out.println("Ok so the revised list now is:- ");    

            System.out.println();
            System.out.println("Data of driver 1:");
            System.out.println("Name:  " + driver1.drivername);
            System.out.println("Team name:  " + driver1.teamname);
            System.out.println("Driver Number:  " + driver1.drivernumber);

            System.out.println();
            System.out.println("Data of driver 2:");
            System.out.println("Name:  " + driver2.drivername);
            System.out.println("Team name:  " + driver2.teamname);
            System.out.println("Driver Number:  " + driver2.drivernumber);


            System.out.println();
            System.out.println("Data of driver 3:");
            System.out.println("Name:  " + driver3.drivername);
            System.out.println("Team name:  " + driver3.teamname);
            System.out.println("Driver Number:  " + driver3.drivernumber);

            System.out.println();
            System.out.println("Data of driver 4:");
            System.out.println("Name:  " + driver4.drivername);
            System.out.println("Team name:  " + driver4.teamname);
            System.out.println("Driver Number:  " + driver4.drivernumber);            
        }

        else if(choice == 'N' || choice == 'n')
        {
            System.out.println("Okay, i know my pre made choice is the best");
        }

        else
        {
            System.out.println("Enter a Valid choice next time");
        }


        data.close();
    }
}
