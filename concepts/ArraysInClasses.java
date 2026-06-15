import java.util.Scanner;

class Car
{
    String Brand;
    String Model;
    int Horsepower;
}

public class ArraysInClasses
{
    
    public static void showCar(Car car)
    {
        System.out.println("Brand: " + car.Brand);
        System.out.println("Model: " + car.Model);
        System.out.println("Horsepower: " + car.Horsepower + " hp");
    }
    public static void main (String[] args)
    {
        Scanner main = new Scanner(System.in);
        Car[] garage = new Car[5];
        
        garage[0] = new Car();
        garage[0].Brand = "Koenigsegg";
        garage[0].Model = "Jesko";
        garage[0].Horsepower = 1600;
        
        garage[1] = new Car();
        garage[1].Brand = "Ferrari";
        garage[1].Model = "La Ferrari";
        garage[1].Horsepower = 950;

        garage[2] = new Car();
        garage[2].Brand = "Hennessey Special Vehicles";
        garage[2].Model = "Venom F5-M";
        garage[2].Horsepower = 2031;

        garage[3] = new Car();
        garage[3].Brand = "Bugatti";
        garage[3].Model = "Bugatti La Voiture Noire";
        garage[3].Horsepower = 1500;
        
        garage[4] = new Car();
        garage[4].Brand = "Pagani Automobili";
        garage[4].Model = "Pagani Zonda R Revolución";
        garage[4].Horsepower = 780;

        System.out.println("This is the code file that makes classes so that we can add as many information as much as we want");
        System.out.println("We are gonna achieve that by actually implementing classes in arrays which means we will combine arrays in Classes");
        for (int i = 0; i < garage.length; i++)
        {
            if (garage[i] != null)
            {
                showCar(garage[i]);
                System.out.println();
            }
        }
        main.close();
    }
}