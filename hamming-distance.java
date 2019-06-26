class Solution {
    public int hammingDistance(int x, int y) {
    int n = x ^ y; 
    int hd = 0; 
  
    while (n > 0)  
    { 
        hd += n & 1; 
        n >>= 1; 
    } 
    return hd;    
  
    }
}
