import java.io.*;
import java.lang.*;
public class Database extends student
{
    public Database()throws IOException
    {
        System.out.println();
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number of new Students");
        int new1;
        new1=Integer.parseInt(in.readLine());
        Database[] n_stud=new Database[new1];
        student[] st=new student[new1];
        for(int n=0;n<new1;n++)
        st[n]=new student();
        for(int n=0;n<new1;n++)
        st[n].show();
    }
}
        