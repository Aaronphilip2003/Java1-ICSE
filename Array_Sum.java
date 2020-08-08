import java.io.*;
class Array_Sum
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 numbers");
        int a[]=new int[10];
        int s=0;
        for(int i=0;i<=9;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
            s+=a[i];
        }
        System.out.println(s);
    }
}
        
            