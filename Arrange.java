import java.io.*;
class Arrange
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String s=br.readLine();
        int len=s.length();
        for(int j=65;j<=90;j++)
        {
            for(int i=0;i<len;i++)
            {
            char ch=s.charAt(i);
            if(ch==j||ch==j+32)
            System.out.print(ch);
        }
    }
    }
}