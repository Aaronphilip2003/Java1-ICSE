import java.io.*;
class Array_2
{
    public static void main(String args[])throws IOException
    {
        int sum=0,sum1=0,i;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int [10];
        System.out.println("Enter 10 numbers");
        for(i=0;i<=9;i++)
         {
             a[i]=Integer.parseInt(br.readLine());
            }
            for(i=0;i<=9;i++)
            
            if(a[i]%2==0)
                sum+=a[i];
            else
            sum1+=a[i];
            System.out.println("Sum of even= "+sum);
            System.out.println("Sum of odd= "+sum1);
           
        }
    }