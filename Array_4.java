import java.io.*;
class Array_4
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int c[]=new int[20];
        System.out.println("Enter an array of 10 numbers");
        int a[]=new int[20];
       for(int i=0;i<10;i++)
       {
           a[i]=Integer.parseInt(br.readLine());
        }
       System.out.println("Enter an array of 20 numbers");
       int b[]=new int[20];
       for(int i=0;i<20;i++)
       {
           b[i]=Integer.parseInt(br.readLine());
       }
       System.out.println("The Array is:");
       for(int i=0;i<20;i++)
       c[i]=a[i]+b[i];
       for(int i=10;i<20;i++)
       c[i]=b[i];
       for(int i=0;i<20;i++)
       System.out.println(c[i]);
    }
}
       