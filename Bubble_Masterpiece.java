import java.io.*;
class Bubble_Masterpiece
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("----------MENU----------");
        System.out.println("1.ASCENDING ORDER");
        System.out.println("2.DESCENDING ORDER");
        System.out.println("------------------------");
        System.out.println("Enter your choice");
        int choice=Integer.parseInt(br.readLine());
        switch(choice)
        {
            case 1:
                {
        System.out.println("Enter 10 numbers:");
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("THE NUMBERS IN ASCENDING ORDER ARE:");
        for(int k=0;k<10;k++)
        System.out.println(a[k]);
    }
    break;
    case 2:
        {
        System.out.println("Enter 10 numbers:");
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(a[j]<a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("THE NUMBERS IN DESCENDING ORDER ARE:");
        for(int k=0;k<10;k++)
        System.out.println(a[k]);
    }
    break;
    default:System.out.println("ENTER THE CORRECT CHOICE");
}
}
}
        