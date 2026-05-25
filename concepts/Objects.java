public class Objects
{
    String studentname;
    String studentmajor;
    int studentrollnumber;

    Objects(String name, String major, int rollnumber)
    {
        studentname = name;
        studentmajor = major;
        studentrollnumber = rollnumber;
    }

    public static void main(String[] args)
    {
        Objects student1 = new Objects(
            "Hrishikesh Shinde",
            "Artificial Intelligence and Machine Learning",
            251215
        );

        System.out.println(student1);
    }
}