import java.io.*;
import java.util.Scanner;
class vowel_in_file_handling
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            String s;
            System.out.println("Enter the string to be entered in the text file");
            s=sc.nextLine();
            FileWriter fw=new FileWriter("abc.txt");
            fw.write(s);
            fw.close();
        FileReader fr=new FileReader("abc.txt");
        int i,count=0;
        char ch;
        while((i=fr.read())!=-1)
        {
            ch=(char)i;
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                count+=1;
            }
        }
        System.out.println(count);
        fr.close();
    }
    catch (Exception e)
    {
        System.out.println(e);
    }
}
}