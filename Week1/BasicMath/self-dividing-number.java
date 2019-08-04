class Solution 
{
    public List<Integer> selfDividingNumbers(int left, int right) 
    {
        
        int i = left; int ii=left; int m; int flag =1;
        List<Integer> list = new ArrayList<Integer>();
        while(i<=right)
        {
            while(i<10)
            {
                 list.add(i);
                 i++;
            }
            ii=i;
            while(ii%10!=0 && flag==1)
            {
               //System.out.print("abc");
                m=ii%10;
               if(i%m==0)
                {
                    ii=ii/10;
                    m=ii%10;
                    flag=1;
                }
                else flag=0;
            }
            if(flag==1 && i>1000 && (i/10)%10!=0 && i%10!=0 && (i/100)%10!=0) list.add(i);
            if(flag==1 && i%10!=0 && (i/10)%10!=0 && i<1000) list.add(i);
            i++;flag=1;
        }
        return list;
    }    
}
