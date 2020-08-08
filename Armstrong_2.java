import java.io.*;
class Armstrong_2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int a=Integer.parseInt(br.readLine());
        int temp=a,sum=0;
        while(a>0)
        {
            int r=a%10;
            sum=sum+(r*r*r);
            a=a/10;
        }
        if(temp==sum)
        System.out.println(temp+" is an armstrong number");
        else
        System.out.println(temp+" is not an armstrong number");
    }
}