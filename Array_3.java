import java.io.*;
class Array_3
{
    public static void main(String args[])throws IOException
    {
        int i;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int [10];
        System.out.println("Enter 10 numbers");
        for(i=0;i<=9;i++)
         {
             a[i]=Integer.parseInt(br.readLine());
            }
            for(i=0;i<=9;i++)
            if(a[i]%2==0)
            System.out.println((a[i]/2)+" ");
            else 
            System.out.println((a[i]*2)+" ");   
        }
    }