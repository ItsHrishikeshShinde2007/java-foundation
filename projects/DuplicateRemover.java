public class DuplicateRemover
{
    static String[] list = {"Koenigsegg", "BMW", "Ferrari", "Buggatti", "McLaren", "BMW", "Hennessey",};
    static String[] list2 = new String[list.length];
    static int uniqueCount = 0;
    public static void list1show()
    {
        for (int i = 0; i < list.length; i++)
        {
            System.out.println((i + 1) + ". " + list[i]);
        }        
    }

    public static void list2show()
    {
        for (int k = 0; k < uniqueCount; k++)
        {
            System.out.println((k + 1) + ". " + list2[k]);
        }
    }

    public static void duplicateremover()
    {
        for (int i = 0; i < list.length; i++)
        {
            boolean unique = true;
            for(int j = 0; j < i; j++)
            {
                if(list[i].equals(list[j]))
                {
                    unique = false;
                    break;
                }
            }
            if(unique)
            {
                list2[uniqueCount] = list[i];
                uniqueCount++;
            }
        }
    }
    public static void main(String[] Args)
    {
        System.out.println("Welcome to the Duplicate Remover");
        System.out.println("This program will allow you to remove duplicates from a list of items");
        System.out.println("So i already have a list of some car brands lets see how it works");
        System.out.println("This is the list of car brands that we have");
        list1show();
        System.out.println("Ok so we can easily say that the brand BMW has been repeated");
        System.out.println("Now lets apply the Duplicate remover");
        duplicateremover();
        list2show();
    }
}