class wecosystem
{
    String Device;
    String Type;
    int Price;

    public wecosystem(String device, String type, int price)
    {
        Device = device;
        Type = type;
        Price = price;
    }
}

class lecosystem extends wecosystem
{
    public lecosystem(String device, String type, int price)
    {
        super(device, type, price);
    }
}
public class Inheritance
{
    public static void defineWdevices(wecosystem[] wdevices)
    {
        wdevices[0] = new wecosystem("Samsung Galaxy S 25 Ultra", "Smart Phone", 130999);
        wdevices[1] = new wecosystem("Samsung Book 6 Ultra", "Laptop", 311999);
        wdevices[2] = new wecosystem("Samsung Galaxy Tab S 11 Ultra", "Tablet", 135999);
        wdevices[3] = new wecosystem("Samsung Galaxy Buds 3 Pro", "TWS", 18000);
    }

    public static void defineLdevices(lecosystem[] ldevices)
    {
        ldevices[0] = new lecosystem("I Phone 17 Pro ultra", "Smart Phone", 353000);
        ldevices[1] = new lecosystem("Macbook Pro 16 inch (M5 Max)", "Laptop", 311999);
        ldevices[2] = new lecosystem("I Pad Pro 13 inch (M4)", "Tablet", 260000);
        ldevices[3] = new lecosystem("Air Pods Pro 3", "TWS", 25000);
    }

    public static void showLdevices(lecosystem ldevices)
    {
        System.out.println("The best Name of device: " + ldevices.Device);
        System.out.println("The best Price of device: " + ldevices.Price + " rs");
        System.out.println("The best Type of device: " + ldevices.Type);
    }

    public static void showWdevices(wecosystem wdevices)
    {
        System.out.println("The best Name of device: " + wdevices.Device);
        System.out.println("The best Price of device: " + wdevices.Price + " rs");
        System.out.println("The best Type of device: " + wdevices.Type);
    }

    public static void showallWdevices(wecosystem[] wdevices)
    {
        for(int i = 0; i < 4; i++)
        {
            if (wdevices[i] != null)
            {
                showWdevices(wdevices[i]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void showallLdevices(lecosystem[] ldevices)
    {
        for(int i = 0; i < 4; i++)
        {
            if (ldevices[i] != null)
            {
                showLdevices(ldevices[i]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main (String[] args)
    {
        wecosystem[] wdevices = new wecosystem[4];
        lecosystem[] ldevices = new lecosystem[4];
        System.out.println("Ok so this code file is to showcase the use of inheritance");
        System.out.println("What it means is that we can now instead of assigning the same elements of one class to another with different name just simply extend");
        System.out.println("Ok so lets just say that I have made two class one which is very well detailes and anothe is just inherted\n");
        defineLdevices(ldevices);
        defineWdevices(wdevices);
        System.out.println("=== L ecosystem ===");
        System.out.println();
        showallLdevices(ldevices);
        System.out.println("=== W ecosystem ===");
        System.out.println();
        showallWdevices(wdevices);
    }
}