import java.io.*;
public class Array_Rev
{
    public static void main(String args[])throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter 10 numbers");
       int a[]=new int[10];
       for(int i=0;i<10;i++)
       {
           a[i]=Integer.parseInt(br.readLine());
        }
        for(int j=9;j>=0;j--)
        System.out.println(a[j]);
    }
}