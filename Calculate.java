class Calculate
{
    int num,f,rev;
    Calculate()
    {
        f=0;
        rev=0;
    }
     void prime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        System.out.println("PRIME");
        else
        System.out.println("NOT");
    }
    void Palin(int n)
    {
        int copy=n;
        while(n>0)
        {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println(rev);
    }
}
    