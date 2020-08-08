import java.io.*;
class Color
{
    String colTop;
    String colBottom;
    public Color()
    {
        colTop="Pink";
        colBottom="Black";
    }
    public Color(String ct,String cb)
    {
        ct=colTop;
        cb=colBottom;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Color obj=new Color();
        System.out.println("Default color 1:"+obj.colTop);
        System.out.println("Default color 2:"+obj.colBottom);
        System.out.println("Enter yout top color:");
        String colt=br.readLine();
        System.out.println("Enter yout Bottom color:");
        String bolt=br.readLine();
        Color obj1=new Color(colt,bolt);
        System.out.println("Your Top color:"+obj1.colTop);
        System.out.println("Your Bottom color:"+obj1.colBottom);
    }
}
    