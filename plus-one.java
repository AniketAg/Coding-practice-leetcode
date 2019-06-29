class Solution {
    public int[] plusOne(int[] digits) {
        
        int carry = 0;
		int[] array = null;

		if (digits[digits.length - 1] == 9) carry = 1;
		
		if (digits[digits.length - 1] < 9) 
        {
			int val = ++digits[digits.length - 1];
			digits[digits.length - 1] = val;
			return digits;
		}
		
		for (int i = digits.length - 1; i >= 0; i--) 
			if (digits[i] == 9) 
            {
            	int temp = ((carry + digits[i]) % 10);
				carry = (carry + digits[i]) / 10;
				digits[i] = temp;
			} 
            else 
            {

				digits[i] = (digits[i] + carry);
				carry = 0;
			}
		
		if (carry == 1) 
        {
        	array = new int[digits.length + 1];
			array[0] = carry;
			for (int i = 1; i < array.length - 1; i++) 
				array[i] = digits[i - 1];
		}
		
        if (carry == 1) return array;
	    else return digits;
		
	    }
}
        /*
            
         
        int[] d; double q = 0 ; double p = 0;
        d =new int[digits.length];
        for(int i=0;i<digits.length;i++){
            q=q*10;
            q=q+digits[i];
        }
        p=q;
        System.out.println(q);
        q++;
        System.out.println(q);
        
        if(digits.length==1 && digits[digits.length-1]!=9){
            digits[digits.length-1]++;    
            return digits;     
        }
        
        int length = 0;
        long temp = 1;
        while (temp <= p) {
            length++;
            temp *= 10;
        }
        System.out.println(length);
        
        int l = 0;
        temp = 1;
        while (temp <= q) {
            l++;
            temp *= 10;
        }
        System.out.println(l);
        if(l>length)
        {
            d =new int[digits.length+1];
            for(int i=1;i<digits.length;i++)
                d[i]=0;
            d[0]=1;
            return d;
        }

                if(digits[digits.length-1]==9)
        {
          for(int i=digits.length-1; i>-1 && q!=0; i--)
        {
            d[i]=(int)q%10;
            System.out.println(d[i]);
            q=q/10;
            
        }
        System.out.println(q);
        d[digits.length-1]=0;
            return d;
  
        }

        digits[digits.length-1]++;    
            return digits;
            
        }*/
