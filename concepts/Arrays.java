import java.util.Scanner;

public class Arrays
{
    public static void main(String[] args)
    {
        Scanner value = new Scanner(System.in);
        System.out.println("Ok so lets start with 1d array do lets add value in array 1 with the size of 10:");
        int[] array = new int[5];
        for (int i = 0; i < 5; i++)
        {
            array[i] = value.nextInt();
        }
        System.out.println("So your array is : ");
        for (int i = 0; i < 5; i++)
        {
            System.out.print(array[i] + ", ");
        }
        System.out.println("\nOk so now lets do the same with 2D array because why not yeah? and built a matrix");
        int[][] array2 = new int[3][3];
        
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                array2[i][j] = value.nextInt();
            }
        }
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(array2[i][j] + " ");
            }
            System.out.print("\n");
        }
        value.close();
    }
}