int[] primeFactors2(int num) 
{
        int quotient = 2;
        int[] primes = new int[0];
        int[] help = new int[0];
        while(num != 1)
        {
            if(num % quotient == 0)
            {
                num /= quotient;
                help = primes;
                primes = new int[help.length + 1];
                for (int i = 0; i < help.length; i++) 
                    primes[i] = help[i];
                primes[primes.length-1] = quotient;
                help = new int[primes.length];
                quotient = 1;
            }
            quotient++;
        }
    
        return remove_duplicates(primes);
}
int[] remove_duplicates(int arr[]) 
{ 
    int n = arr.length;
    if (n==0 || n==1) 
        return arr; 
  
    int temp[] = new int[n]; 
  
    int j = 0; 
    for (int i=0; i<n-1; i++) 
        if (arr[i] != arr[i+1]) 
            temp[j++] = arr[i]; 
  
    temp[j++] = arr[n-1]; 
    
    int a[] = new int[j]; 
  
    for (int i=0; i<j; i++) 
        a[i] = temp[i]; 
  
    return a; 
} 
