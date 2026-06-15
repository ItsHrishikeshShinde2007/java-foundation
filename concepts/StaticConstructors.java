import java.util.Scanner;

class Laptop
{
    String Brand;
    String Model;
    String GPU;
    int Price;

    public Laptop(String brand, String model, String gpu, int price)
    {
        Brand = brand;
        Model = model;
        GPU = gpu;
        Price = price;
    }
}



public class StaticConstructors
{
    public static void showlaptop(Laptop Laptop)
    {
        System.out.println("Brand: " + Laptop.Brand);
        System.out.println("Model: " + Laptop.Model);
        System.out.println("GPU: " + Laptop.GPU);
        System.out.println("Price: " + Laptop.Price);
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner main = new Scanner(System.in);
        System.out.println("This is the code file that explains the working of constructors");
        System.out.println("Constrtuctore are just easily accessible using of class rather than typing all data manually");
        System.out.println("This is the Lits of all the laptops:- ");
        Laptop rog = new Laptop("ASUS", "ROG Zephyrus" , "RTX 5090" , 150000);
        showlaptop(rog);
        Laptop legion = new Laptop("Lenovo", "Legion Pro 7" , "RTX 5080" , 130000);
        showlaptop(legion);
        Laptop alienware = new Laptop("Dell", "Alieware M18" , "RTX 5090" , 170000);
        showlaptop(alienware);
        Laptop hp = new Laptop("HP", "Victus 15" , "RTX 3050" , 80000);
        showlaptop(hp);
        main.close();
    }
}