import java.io.*;
class Amazon
{
    String notp;
    void Elec()throws IOException
    {
        int choice1;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("1-Apple Macbook Pro-1600$");
    System.out.println("2-Apple Iphone 8 (Jet Black 128gb )-750$");
    System.out.println("3-Samsung Smart TV -2000$");
    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.print("Enter your Choice:");
    choice1=Integer.parseInt(br.readLine());
    switch(choice1)
    {
        case 1:System.out.println("Enter your name:");
        notp=br.readLine();
        System.out.println("Name of the Article:Apple Macbook pro");
        System.out.println("Price of the Article:1600$");
        System.out.println("---------PURCHASE CARD---------");
        System.out.println("Name of the customer:"+notp);
        System.out.println("Name of the article:Apple Macbook pro");
        System.out.println("Price of the article:1600$");
        System.out.println("-------------------------------");
        break;
        case 2:System.out.println("Enter your name:");
        notp=br.readLine();
        System.out.println("Name of the Article:Apple Iphone 8 (Jet Black 128gb )");
        System.out.println("Price of the Article:750$");
        System.out.println("---------PURCHASE CARD---------");
        System.out.println("Name of the customer:"+notp);
        System.out.println("Name of the article:Apple Iphone 8 (Jet Black 128gb )");
        System.out.println("Price of the article:750$");
        System.out.println("-------------------------------");
        break;
        case 3:System.out.println("Enter your name:");
        notp=br.readLine();
        System.out.println("Name of the Article:Samsung Smart TV ");
        System.out.println("Price of the Article:2000$");
        System.out.println("---------PURCHASE CARD---------");
        System.out.println("Name of the customer:"+notp);
        System.out.println("Name of the article:Samsung Smart TV");
        System.out.println("Price of the article:2000$");
        System.out.println("-------------------------------");
        break;
    }
}
    public static void main(String args[])throws IOException
    {
        
        Amazon obj =new Amazon();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to Amazon.com");
        try{
         Thread.sleep(2000);
         System.out.println("1-Electronics");
        }
        catch(InterruptedException e){
            System.err.println(e.getMessage());
        }
        System.out.println("Enter your choice");
        int choice2=Integer.parseInt(br.readLine());
        switch(choice2)
        {
            case 1:obj.Elec();
            break;
            default:System.out.println("Select the right category");
        }
    }
}




        
            
                   
        