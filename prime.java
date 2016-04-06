class prime1To100
{
    public static void main()
    {
        int i,k,j;
        for(i=1;i<100;i++)
        {
            k=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    k=1;
                    break;
                }
            }
            if(k==0)
            {
                System.out.println(i);
            }
        }
    }
}


More Programs: http://javamylanguage.blogspot.com/2011/12/java-program-to-print-all-numbers.html#ixzz452Pnsa5g