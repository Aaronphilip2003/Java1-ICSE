import java.io.*;
class bluej123
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String s=br.readLine();
        int len=s.length();
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            System.out.println(ch+" "+(int)ch);
        }
    }
}