import java.io.*;
class Ascii_Binary
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an Alphabet:");
        char alpha=(char)br.read();
        int ascii=(int)alpha;int rem=0;int sum=0;
        System.out.println("ASCII value of the alphabet is:"+ascii);
    }
}