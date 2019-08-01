class Solution {
    public boolean lemonadeChange(int[] bills) {
        if(bills[0]!=5)
            return false;
        
        int count = 0, count1 = 0; 
        for(int i = 0 ; i < bills.length ; i++)
            if(bills[i]==5)
                count++;
            else if(bills[i]==10)
            {
                if(count==0)
                        return false;
                count-=1;
                count1++;
            }
            else if(bills[i]==20)
            {
                if(count == 0)
                        return false;
                else if(count == 1 && count1 == 0)
                    return false;
                else if(count == 2 && count1 == 0)
                    return false;
                else if(count > 2 && count1 == 0)
                        count-=3;
                else if(count > 0 && count1 > 0)
                {
                    count--;count1--;
                }   
            }
        return true;
    }
}
