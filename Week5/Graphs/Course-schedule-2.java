class Solution 
{
    public int[] findOrder(int numCourses, int[][] prerequisites) 
    {
        if(numCourses == 0) return null;
        int[] res = new int[numCourses];
        int[] countpre = new int[numCourses];
        int L = prerequisites.length;
        int index = 0;
        
        for(int i = 0; i < L; i++)
            countpre[prerequisites[i][0]]++;
        
        Queue<Integer> queue = new LinkedList<Integer>();//store taken classes 
        for(int i = 0; i < numCourses; i++)
            if(countpre[i] == 0)
            {
                queue.offer(i);//take the class
                res[index] = i;//put into class list
                index++;
            }
        
        while(!queue.isEmpty())
        {
            int pre = queue.poll();
            for(int i = 0; i < L; i++)
                if(pre == prerequisites[i][1])
                {
                    countpre[prerequisites[i][0]]--;
                    if(countpre[prerequisites[i][0]] == 0)
                    {   
                        if(index < numCourses) 
                        res[index] = prerequisites[i][0];
                        
                        index++;                    
                        queue.offer(prerequisites[i][0]);
                    }                    
                }
        }
        return (index == numCourses) ? res : new int[0];
    }
}
