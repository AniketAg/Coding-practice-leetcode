class Solution {
    public boolean isHappy(int n) {
  
    HashSet<Integer> hashSet = new HashSet<Integer>();
  
    while (!hashSet.contains(n)) 
    {
        hashSet.add(n);
        int temp = 0;
    
        while (n > 0) 
        {
            temp += Math.pow(n % 10, 2);
            n /= 10;
        }
        
        n = temp;
    
    }
    
        return n == 1;
        
        /* int b=n;
        if(b==7)
                return true;
        else if(b==22)
            return false;
        else if(b==70)
            return true;
        int s,i;int count =0;
        int[] a = new int[20];
        while(true)
        {
            i = 0;count++;
            while(b!=0)
            {
                a[i++]=b%10;
                b=b/10;
                System.out.println(a[i-1]);
            }
            s=0;
            for(i=0; i<a.length-1; i++)
                s=s+(a[i]*a[i]);
            b = s;
            if(s==1)
                return true;
            else if(count==100000)
                return false;
        }
*/
}
}
