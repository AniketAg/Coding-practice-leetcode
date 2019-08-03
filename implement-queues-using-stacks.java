class MyQueue {
    //stack has the rule: last in, 1st out
	//maintain 2 stacks, "mainstk" for main operations (push, size and empty) and the other "tempstk" for (pop and peek)
    private Stack<Integer> mstk, tempstk;
    /**
     * Initialize your data structure here.
     */
    public MyQueue() 
    {
        mstk = new Stack<>();
        tempstk = new Stack<>();
    }

    public void push(int x) 
    {
        mstk.push(x);
    }
    
    public int pop() 
    {
        return getFirst(true);
    }

    public int peek() 
    {
        return getFirst(false);
    }

    int getFirst(boolean withPop) 
    {

		//if mainstk doesn't have anything return -1 (it's not required step as they said in the notes it will be guaranteed that it will have data) 
        if (mstk.size() == 0)
            return -1;
		
		//pop everything from mstk and push them (in a revrse order) to tempstk 
        while (mstk.size() > 0)
            tempstk.push(mstk.pop());
        
		//store the result 
        int result = 0;
        if (withPop)
            result = tempstk.pop();
        else result = tempstk.peek();

		//push them back to mstk in case we need to do more push ops 
        while (tempstk.size() > 0) 
            mstk.push(tempstk.pop());
        
        return result;
    }

    public boolean empty() 
    {
        return mstk.size() == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
