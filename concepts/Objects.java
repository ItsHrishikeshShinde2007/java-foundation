public class Objects
{
        String name;
        String team;
        int wdc;

    public static void main (String[] args)
    {
        Objects max = new Objects();

            max.name = "Max Verstappen";
            max.team = "Red Bull Racing Formua One Team";
            max.wdc = 4;

            System.out.println("Name: " + max.name);
            System.out.println("Team: " + max.team);
            System.out.println("World Championships: " + max.wdc);
    }
}