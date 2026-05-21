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
            System.out.println("a. Add a new task");
            System.out.println("b. Delete a completed task");
            System.out.println("c. Show the list");
            System.out.println("d. Exit");
            char option = tasks.next().charAt(0);
            System.out.println("");
            switch(option)
            {
                case 'a':
                    System.out.print("Please state the Task: ");
                    tasks.nextLine();
                    String task = tasks.nextLine();
                    alltasks[count] = task;
                    count++;
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
                        System.out.println();
                        System.out.println("Tell me which task is it that you want to delete: ");
                        int rm = tasks.nextInt() - 1;
                        System.out.println();
                        if(rm < 0 || rm >= count)
                        {
                            System.out.println("Invalid task number.");
                            System.out.println();
                        }
                        else
                        {
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
                            System.out.println();
                        }
                    }
                    break;
                case 'c':
                        System.out.println("The tasks are:- ");
                        for(int i = 0; i < count ; i++)
                        {
                            System.out.println("Task "+ (i + 1) + " : " + alltasks[i]);
                        }
                        System.out.println();
                    break;
                case 'd':
                    System.out.println("Simply lovely");
                    tasks.close();
                    return;
                default:
                    System.out.println("Incorrect choice");
                    break;
            }
        }
    }
}