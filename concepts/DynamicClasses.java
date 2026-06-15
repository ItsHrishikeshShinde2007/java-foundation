import java.util.Scanner;

class Car
{
    String Brand;
    String Model;
    int Horsepower;
}

public class DynamicClasses
{
    
    public static void showCar(Car car)
    {
        System.out.println("Brand: " + car.Brand);
        System.out.println("Model: " + car.Model);
        System.out.println("Horsepower: " + car.Horsepower + " hp");
    }

    public static void showGarage(Car[] garage)
    {
        for (int i = 0; i < garage.length; i++)
        {
            if (garage[i] != null)
            {
                showCar(garage[i]);
                System.out.println();
            }
        }
    }

    public static void addCar(Car[] garage, int count, Scanner main)
    {
        System.out.println("Ok so you have chosen to add a car");
        if(count >= garage.length)
        {
            System.out.println("Damn bro you have 10 cars now enough of buying car");
            System.out.println("You can send some money to me i would love to have a car too");
            System.out.println("Or else try buying race tracks now");
            return;
        }
        garage[count] = new Car();
        System.out.print("Ok so please enter the of Brand your car: ");
        garage[count].Brand = main.nextLine();
        System.out.print("Ok so please enter the of Model your car: ");
        garage[count].Model = main.nextLine();
        System.out.print("Ok so please enter the horsepower your car makes: ");
        garage[count].Horsepower = main.nextInt();
        main.nextLine();
        showGarage(garage);
    }

    public static void defaultgarage(Car[] garage)
    {
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
    }

    public static void main (String[] args)
    {
        Scanner main = new Scanner(System.in);
        Car[] garage = new Car[10];
        int count = 5;
        while (true) 
        {
            System.out.println("This is the code file that makes dynamic classes so that we can add as many information as much as we want");
            System.out.println("We are gonna achieve that by actually implementing classes in arrays which means we will combine arrays in Classes");
            System.out.println("Ok so this is list of cars that is already in the class");
            defaultgarage(garage);
            showGarage(garage);
            System.out.println("Do you want to add any cars('Y'/'N')");
            char choice = main.nextLine().charAt(0);
            switch (choice)
            {
                case 'Y':
                case 'y':
                    addCar(garage, count, main);
                    count++;
                break;

                case 'N':
                case 'n':
                    System.out.println("Simply lovely");
                    main.close();
                return;

                
                default:
                    System.out.println("That will not work choose either yes or no. ('Y'/'N')");
                    System.out.println();
                break;
            }            
        }
    }
}