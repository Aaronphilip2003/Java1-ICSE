import java.io.*; // importing package
class Bubble_sort
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 numbers");
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(br.readLine()); // taking in the inputs and putting them in an array
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
        System.out.println("THE NUMBERS ARE:");
        for(int k=0;k<10;k++)
        System.out.println(a[k]);
    }
} // program over
                    
            
