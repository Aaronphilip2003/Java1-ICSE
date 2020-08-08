import java.io.*;
class BEGINENDVOWEL
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String s=br.readLine();
        s=s+" ";String w="";String s1="";
        int len=s.length();
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                char ch1=s.charAt(0);
                char ch2=s.charAt(w.length()-1);
                if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
                {
                    if(ch1==ch2)
                System.out.println(w);
               }
                w="";
            }
            else
            w=w+ch;
        }
    }
}
            