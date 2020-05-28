import java.io.*;
import java.lang.*;
import java.util.*;
public class student
{
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String uniqueID;
    private String courses="";
    private static int costOfCourse=600;
    //private int balance;
    private int tutionfee=0;
    static int x=2000;
     BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    public student()throws IOException
    {
        //clrscr();
        System.out.print('\u000C');
        System.out.println("Please enter your First Name");
        firstName=in.readLine();
        System.out.println("Please enter your Last Name");
        lastName=in.readLine();
        System.out.println("\n\n\nGrade options:\n1.Engineering\n2.Medical\n3.Commerce\n4.Arts\nPlease enter your grade number");
        gradeYear=Integer.parseInt(in.readLine());
        uniqueID=setID();
        enrollCourse();
        payment();
    }
    private String setID()
    {
        x++;
        return (gradeYear+""+x);
    }
    private void enrollCourse()throws IOException
    {
        System.out.println("\n\n\nCourses availaible:\nHistory\nMaths\nEnglish\nChemistry\nComputer SCience");
        System.out.println("\nEnter theNumber of courses you want to enroll");
        int n=Integer.parseInt(in.readLine());
        tutionfee+=n*costOfCourse;
        while(n-->0)
        {
        System.out.println("\nEnter the course name you want to enroll");
        String course=in.readLine();
        courses+=course;
        }
        
        /*while(!course.equals("Q"));
        {
            System.out.println("Enter the course you want to enroll(Q to exit)");
            course=in.readLine();
            if(!course.equals("Q"))
            {
            courses+="\n"+course;
            tutionfee+=costOfCourse;
            }
        }*/
    }
    private void viewBalance()
    {
        System.out.println("Your balance is:$"+tutionfee);
    }
    private void payment()throws IOException
    {
        viewBalance();
        System.out.print("\nEnter your payment:$");
        int pay=Integer.parseInt(in.readLine());
        tutionfee=tutionfee-pay;
        System.out.println("\nThanks for your payment\n\nYour remaining balance is:$"+tutionfee);
    }
    public void show()
    {
        System.out.println("\n\n\nStudent Name:"+firstName+" "+lastName+"\nUnique ID:"+uniqueID+"\nCourses Enrolled:\n"+courses+"\nBalance Remaining:$"+tutionfee);
    }
}