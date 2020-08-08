import java.io.*;
class Binary
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String:");
        String asciiString=br.readLine();
        byte[] bytes=asciiString.getBytes();
        StringBuilder binary=new StringBuilder();
        for(byte b:bytes)
        {
            int val=b;
            for(int i=0;i<8;i++)
            {
                binary.append((val&128)==0?0:1);
                val<<=1;
            }
            binary.append(' ');
        }
        System.out.println(binary);
    }
}
                