class MyHashSet 
{
    int [] h;
    int size;
    int shift;
    /** Initialize your data structure here. */
    public MyHashSet() 
    {
        int n = (int) Math.floor(1000000/31);
        size = 1;
        
        for (shift=0; size < n; size <<= 1, shift++);
            h = new int[size];
    }
    
    public void add(int key) 
    {
		// setting the correct bit of the (hey % size)-th entry in the array 
        h[key & (size - 1)] |= 1 << (key >>> shift);
    }
    
    public void remove(int key) 
    {
		// unsetting the correct bit of the (hey % size)-th entry in the array 
        h[key & (size - 1)] &= ~(1 << (key >>> shift));
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) 
    {
        return (h[key & (size - 1)] & (1 << (key >>> shift))) != 0;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
