import java.io.*;
class Case
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String s=br.readLine();
        int len=s.length();
        String s1="";
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(Character.isLowerCase(ch))
            s1=s1+Character.toUpperCase(ch);
            else if(Character.isUpperCase(ch))
            s1=s1+Character.toLowerCase(ch);
            else
            s1=s1+ch;
        }
        System.out.println(s1);
    }
}
 