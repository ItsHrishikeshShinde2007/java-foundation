import java.util.Scanner;

class Phone
{
    String Brand;
    String Model;
    int Cameramp;
    int Price;
    public Phone(String brand, String model, int camera, int price)
    {
        Brand = brand;
        Model = model;
        Cameramp = camera;
        Price = price;
    }
}

public class DynamicConstructors
{
    static int count = 4;
    public static void addphone(Scanner main, Phone[] phones)
    {
        if(count >= phones.length)
        {
            System.out.println("10 Phones are a lot if you still have more money, send me 👍");
            return;
        }
        System.out.print("Please Enter the name of the brand of the phone: ");
        String newbrand = main.nextLine();
        System.out.print("Please Enter the name of the model of the phone: ");
        String newmodel = main.nextLine();
        System.out.print("Please Enter the name of the mega pixel of camera of the phone: ");
        int newcamera = main.nextInt();
        System.out.print("Please Enter the name of the price of the phone: ");
        int newprice = main.nextInt();
        main.nextLine();
        phones[count] = new Phone(newbrand, newmodel, newcamera, newprice);
        count++;
        showallphones(phones);
    }

    public static void showphones(Phone phone)
    {
        System.out.println("Brand name of phone: " + phone.Brand);
        System.out.println("Model name of phone: " + phone.Model);
        System.out.println("Megapixel of camera of phone: " + phone.Cameramp + " mp");
        System.out.println("Price of phone: " + phone.Price + " rs");
        System.out.println();
    }

    public static void defaultlist(Phone[] phones)
    {

        phones[0] = new Phone("Samsung", "S 24 Ultra", 200, 119999);
        phones[1] = new Phone("One Plus", "15", 50, 77999);
        phones[2] = new Phone("OPPO", "Find X9 Ultra", 200, 169999);
        phones[3] = new Phone("VIVO", "X 300 Ultra", 200, 159999);
    }

    public static void showallphones(Phone[] phones)
    {
        for (int i = 0; i < count; i++)
        {
            if (phones[i] != null)
            {
                showphones(phones[i]);
            }
        }
    }
    public static void main(String[] args)
    {
        Phone[] phone = new Phone[10];
        Scanner main = new Scanner(System.in);
        System.out.println("This is the code file that creates constructors so that they data stays dynamic and never runs out of size limit");
        System.out.println("Now we see the constructors by phones and their specs");
        defaultlist(phone);
        showallphones(phone);
        while (true)
        {
            System.out.println("So now would you want to add any new phone to the constructor?");
            char choice = main.nextLine().charAt(0);
            switch (choice)
            {
                case 'Y':
                case 'y':
                    addphone(main, phone);
                break;

                case 'N':
                case 'n':
                    System.out.println("Simply Lovely");
                    main.close();
                return;

                default:
                    System.out.println("Please enter a valid choice ('y'/'n') or ('Y'/'N')");
                    break;
            }
        }
    }
}