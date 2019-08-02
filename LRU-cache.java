class LRUCache 
{
    private class Node 
    {
        public int key = -1, value= -1;
        public Node next = null, pre = null;
        public Node(int k, int v)
        {
            key = k;
            value = v;
        }    
    }
    
    private HashMap<Integer, Node> hm = null;
    private Node head = null, tail = null;
    private int capacity = 0;
    
    public LRUCache(int capacity) 
    {
        hm = new HashMap();
        this.capacity = capacity;
    }
    
    public int get(int key) 
    {
        Node e = hm.get(key);
        if(e == null)
            return -1;
        else
        {
            put(key, e.value);
            return e.value;
        }
    }
    
    public void put(int key, int value) 
    {
        if(!hm.containsKey(key))
        {
            Node e = new Node(key, value);
            hm.put(key, e);
            if(head == null)
            {
                head = e;
                tail = e;
            }
            e.pre = tail;
            e.next = tail.next;
            tail.next = e;
            tail = e;
            if(hm.size() > capacity)
            {
                hm.remove(head.key);
                head.next.pre = head.pre;
                head = head.next;
            }
        } 
        else 
        {
            Node e = hm.get(key);
            if(e != tail)
            {
                if(e == head)
                {
                    head.next.pre = head.pre;
                    head = head.next;
                } 
                else 
                {
                    e.next.pre = e.pre;
                    e.pre.next = e.next;
                }
                e.pre = tail;
                e.next = tail.next;
                tail.next = e;
                tail = e;
            }
            e.value = value;
        }
    }
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
