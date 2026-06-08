import java.util.Scanner;

public class Arrays
{
    public static void main(String[] args)
    {
        Scanner newarray = new Scanner(System.in);
        System.out.println("This file takes in and prints array elements");
        System.out.print("Please enter the size of array you want within (20 ints): ");
        int size = newarray.nextInt();
        int[] array = new int[size];
        System.out.println("Ok so the size of the array is " + size);
        System.out.println("So now enter " + size + " int elements");
        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter the " + (i + 1) + " th element please: ");
            array[i] = newarray.nextInt();
        }
        System.out.println("Damn that is a good array you got there, here it is your 1 d array: ");
        for(int i = 0; i < size; i++)
        {
            System.out.print(array[i] + ", ");
        }
        System.out.println("\nHaha, that was fun, Now let's make a 2 d array");
        System.out.println("lets keep the size of this 2d array simple alright? 3 rows and 3 elements this time.");
        int[][] array2 = new int[3][3];
        System.out.println("Ok so since this is a 3 X 3 array let's enter 9 elements alright?");
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print("Enter element [" + (i + 1) + "][" + (j + 1) + "]: ");
                array2[i][j] = newarray.nextInt();
            }
        }
        System.out.println("Damn that was a good 2d array, lets print but this time in matrix form");
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
        newarray.close();
    }
}