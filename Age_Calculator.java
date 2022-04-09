import java.io.*;
class Age_Calculator
{        
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the year of your birth");
        int year=Integer.parseInt(br.readLine());
        System.out.println("Enter the current year");
        int Cyear=Integer.parseInt(br.readLine()); // input
        System.out.println("Enter the month of your birth");
        int month=Integer.parseInt(br.readLine());
        System.out.println("Enter the Current month");
        int Cmonth=Integer.parseInt(br.readLine());
        if(Cmonth>month)
        System.out.println("Your current age is: "+(Cyear-year)+" "+"years"+" "+"and"+" "+(Cmonth-month)+" "+"months");
        else
        System.out.println("Your current age is: "+(Cyear-year)+" "+"years"+" "+"and"+" "+(month-Cmonth)+" "+"months");

    }
}
