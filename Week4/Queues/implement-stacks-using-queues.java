class MyStack {
    public Queue<Integer> pusher = new ArrayDeque<>();
    public Queue<Integer> popper = new ArrayDeque<>();
    /** Initialize your data structure here. */
    public MyStack() 
    {}
    /** Push element x onto stack. */
    public void push(int x) 
    {
        pusher.add(x);
        while (!popper.isEmpty()) pusher.add(popper.poll());
        {
            Queue<Integer> temp = pusher;
            pusher = popper;
            popper = temp;
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() 
    {
        return !popper.isEmpty() ? popper.poll() : Integer.MAX_VALUE;
    }
    
    /** Get the top element. */
    public int top() 
    {
        return !popper.isEmpty() ? popper.peek() : Integer.MAX_VALUE;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() 
    {
        return popper.isEmpty();    
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
