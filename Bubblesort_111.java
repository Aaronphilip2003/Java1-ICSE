import java.io.*;
class Bubblesort_111
{
    public static void main(String bitch[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 numbers:");
        int a[]=new int[10];int flag=0;
        int i,j,temp;
        for(i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        for(i=0;i<9;i++)
        {
            for(j=0;j<9-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(i=0;i<10;i++)
        System.out.println(a[i]);
    }
}