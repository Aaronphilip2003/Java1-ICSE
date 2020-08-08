import java.io.*;
class Binary_search
{
    public static void main(String bitch[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 numbers:");
        int a[]=new int[10];int flag=0;
        int i;
        for(i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the number to be searched:");
        int search=Integer.parseInt(br.readLine());
        int min=0,max=9,mid=0;
        while(min<=max)
        {
            mid=(min+max)/2;
            if(search==a[mid])
            {
                flag=1;
                break;
            }
            else if(search<a[mid])
            max=mid-1;
            else
            min=mid+1;
        }
        if(flag==1)
        System.out.println(search+" is found at "+(mid+1)+"th position");
        else
        System.out.println("UNSUCCESSFUL SEARCH");
    }
}