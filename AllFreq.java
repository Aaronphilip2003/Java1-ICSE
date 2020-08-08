import java.util.*;
class AllFreq
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence:");
        String s=sc.nextLine();
        for(int j=65;j<=90;j++)
        {
            int c=0;
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch==(char)j||ch==(char)(j+32))
                c++;
            }
            if(c>0)
            System.out.println((char)j+"\t"+c);
        }
    }
}