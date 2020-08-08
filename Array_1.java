import java.io.*;
class Array_1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int[8];
        int i;
        System.out.println("Enter 8 numbers");
        for(i=0;i<=7;i++)
         {
             a[i]=Integer.parseInt(br.readLine());
            }
            for(i=0;i<=7;i++)
            if(a[i]%2==0)
            System.out.println("Even numbers = "+a[i]);
        }
    }
    