import java.util.Scanner;

public class Methods

{
    public static void add(int a, int b)
    {
        System.out.println(a + b);
    }

    public static void greet()
    {
        System.out.println("Hello, World!");
    }
    public static void main(String[] args)
    {
        greet();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        System.out.println("Enter a number");
        int y = sc.nextInt();
        add(x, y);
        sc.close();
    }
}