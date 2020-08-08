import java.io.*;
class bufferedreader {
    public static void main(String args[])throws IOException
    {
        int x,y,sum;
        InputStreamReader read =new InputStreamReader(System.in);
       BufferedReader in=new BufferedReader(read);
        System.out.println("Enter he first number");
        x=Integer.parseInt(in.readLine());
        System.out.println("Enter the second number");
        y=Integer.parseInt(in.readLine());
        sum=x+y;
        System.out.print("The sum of the following numbers is = " + sum);
    }
}