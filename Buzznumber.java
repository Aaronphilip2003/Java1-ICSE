import java.io.*;
class Buzznumber
 {
     public static void main(String args[])throws IOException
     {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter a number");
         int a=Integer.parseInt(br.readLine());
         if(a%7==0||a%10==7)
          {
              System.out.println(a+" is a Buzz number");
            }
            else
            {
                System.out.println(a+" is not a buzz number");
            }
        }
    }