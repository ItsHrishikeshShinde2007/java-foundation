import java.util.Scanner;

public class ScannerInput
{
    public static void main(String[] args)
    {
        Scanner hrishikesh = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = hrishikesh.nextLine();
        System.out.println("Hello " + name + " welcome, grab yourself some beer!");
        hrishikesh.close();
    }
}
