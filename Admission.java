import java.io.*;
class Admission
 {
     public static void main(String args[])throws IOException
      {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the percentage you got in Maths:");
          int m=Integer.parseInt(br.readLine());
          System.out.println("Enter the percentage you got in Science:");
          int sc=Integer.parseInt(br.readLine());
          System.out.println("Enter the percentage you got in English:");
          int eng=Integer.parseInt(br.readLine());
          if(m>=80&&sc>=80&&eng>=80)
          System.out.println("You are eligible for pursuing Pure Science, Bio. Science or Commerce as your stream.");
          else if(m>=60&&sc>=80&&eng>=80)
          System.out.println("You are eligible for pursuing Bio. Science or Commerce as your stream.");
          else if(m<=60&&sc<=60&&eng<=60)
          System.out.println("You are eligible for pursuing only Commerce as your stream.");
        }
    }