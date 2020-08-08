import java.io.*;
class Characterplus1
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
            s1=s1+Character.toUpperCase((char)(ch+1));
        }
        System.out.println(s1);
    }
}
            