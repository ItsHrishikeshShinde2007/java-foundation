import java.util.Scanner;

public class New
{
    int choice;
    String Subname;
    String Teachername;
    int avgmarksalloted;
    
    public static void main (String[] args)
    {
        System.out.println("This is the code that tells you the approximate value of what the average marks every subject ma'am has given to the students");
        Scanner subname = new Scanner(System.in);
        New[] subjects = new New[3];

            subjects[0] = new New();
            subjects[0].Subname = "Maths";
            subjects[0].Teachername = "Ma'am Anitha";
            subjects[0].avgmarksalloted = 80;

            subjects[1] = new New();
            subjects[1].Subname = "Data Structures";
            subjects[1].Teachername = "Maam Priyanka";
            subjects[1].avgmarksalloted = 90;

            subjects[2] = new New();
            subjects[2].Subname = "Structured Programming";
            subjects[2].Teachername = "Dhanawale Sir";
            subjects[2].avgmarksalloted = 90;

            System.out.println("Subject Name:");
            for (int i = 0; i < subjects.length; i++)
            {
                System.out.println((i + 1) + ". " + subjects[i].Subname);
            }
            System.out.println("Enter the subject number to know the average marks alloted by the teacher:");
            int input = subname.nextInt();
            if (input >= 1 && input <= subjects.length)
            {
                System.out.println("Subject: " + subjects[input - 1].Subname);
                System.out.println("Teacher: " + subjects[input - 1].Teachername);
                System.out.println("Average Marks Alloted: " + subjects[input - 1].avgmarksalloted);
            }
            else
            {
                System.out.println("Invalid subject number. Please try again.");
            }
            subname.close();
    }
}
