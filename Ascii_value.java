import java.io.*;
class Ascii_value
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
        System.out.println("The ASCII value of the entered String is "+(int)(ch));
        }
    }
}
    