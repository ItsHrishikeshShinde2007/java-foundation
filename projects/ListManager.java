import java.util.Scanner;

public class ListManager
{
    public static void main(String[] args)
    {
        int count = 0;
        String[] alltasks = new String[100];
        Scanner tasks = new Scanner(System.in);
        while(true)
        {
            System.out.println("Welcome to the List Manager app.");
            System.out.println("Choose from the below");
            System.out.println("a. Add a new Task");
            System.out.println("b. Delete a completed a Task");
            System.out.println("c. Show the list");
            System.out.println("d. Exit");
            char option = tasks.next().charAt(0);
            System.out.println("\n");
            switch(option)
            {
                case 'a':
                    System.out.print("Please state the Task: ");
                    tasks.nextLine();
                    String task = tasks.nextLine();
                    alltasks[count] = task;
                    count++;
                    System.out.println("\n");
                    break;
                case 'b':
                    if(count == 0)
                    {
                        System.out.println("There is no task added in the list that you can delete.");
                    }
                    else if(count != 0)
                    {
                        System.out.println("The tasks are:- ");
                        for(int i = 0; i < count ; i++)
                        {
                            System.out.println("Task "+ (i + 1) + " : " + alltasks[i]);
                        }
                        System.out.println("Tell me which task is it that you want to delete: ");
                        int rm = tasks.nextInt() - 1;
                        for(int i = rm; i < (count - 1); i++ )
                        {
                            alltasks[i] = alltasks[i + 1];
                        }
                        count--;
                        System.out.println("Revised List is:- ");
                        for(int i = 0; i < count ; i++)
                        {
                            System.out.println("Task "+ (i + 1) + " : " + alltasks[i]);
                        }
                    }
                    System.out.println("\n");
                    break;
                case 'c':
                        System.out.println("The tasks are:- ");
                        for(int i = 0; i < count ; i++)
                        {
                            System.out.println("Task "+ (i + 1) + " : " + alltasks[i]);
                        }
                    System.out.println("\n");
                    break;
                case 'd':
                    System.out.println("Simply lovely");
                    tasks.close();
                    System.out.println("\n");
                    return;
            }
        }
    }
}