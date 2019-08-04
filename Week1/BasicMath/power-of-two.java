class Solution {
    public boolean isPowerOfTwo(int n) {
        int flag=1;
       if(n==0)
            return false;
       while(n!=0 && flag!=0){
            //System.out.println(n);
            if(n%2==0 || n==1)
            {
                n=n/2;
                flag=1;
            }    
            else flag=0;
        }
        if(flag==1)
            return true;
        else return false;
    }
}
