import java.util.Scanner;

public class ListManager
{
    static String[] list = new String[100];
    static int size = 0;
    static Scanner main = new Scanner(System.in);
    public static void adding_index()
    {
        System.out.println("Please enter the Task you want to add to the list");
        String task = main.nextLine();
        System.out.println("Ok so you entered: " + task + " that is a good pick, Simply lovely");
        list[size] = task;
        size++;
    }

    public static void deleting_index()
    {
        if(size == 0)
        {
            System.out.println("The list is empty, there is nothing to delete");
            return;
        }
        else
        {
            System.out.println("Ok so these are the tasks that you have added to the list");
            listing_index();
            System.out.println("Please state the index of Task you want to remove from the list");
            int index = main.nextInt();
            main.nextLine();
            index--;
            if(index < 0 || index >= size)
            {
                System.out.println("Invalid index, please try again");
                return;
            }
            for(int i = index; i < size - 1; i++)
            {
                list[i] = list[i + 1];
            }
            size--;
            System.out.println("Task " + (index + 1) + " removed successfully.");
        }

    }

    public static void listing_index()
    {
        System.out.println("This is the entire list of tasks that you have added to the list");
        for(int i = 0; i < size; i++)
        {
            System.out.println((i + 1) + ": " + list[i]);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to the List Manager or in other words the To Do List Manager");
        System.out.println("This program will allow you to manage your to do list, you can add items to the list, delete items from the list and also view the list");
        System.out.println("So lets start by asking the user what they want to do");
        while(true)
        {
            System.out.println("Please enter the command:");
            System.out.println("a. Add an item to the list");
            System.out.println("b. Delete an item from the list");
            System.out.println("c. View the list");
            System.out.println("d. Exit the program");
            char command = main.nextLine().charAt(0);
            switch(command)
            {
                case 'a':
                    adding_index();
                    break;
                case 'b':
                    deleting_index();
                    break;
                case 'c':
                    listing_index();
                    break;
                case 'd':
                    System.out.println("Simply lovely");
                    main.close();
                    return;
                default:
                    System.out.println("Invalid command, please try again");
            }
        }
    }    
}