class Solution 
{
    public int networkDelayTime(int[][] times, int N, int K) 
    {
        int[] minTime = new int[N+1];Arrays.fill(minTime,Integer.MAX_VALUE);int newTime = 0;
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> back = new HashMap<>();
        map.put(K,0);minTime[K] = 0;
        while(map.size()!=0)
        {
            for(int key:map.keySet())
            {
                int hasTime = map.get(key);
                for(int[] time:times)
                    if(time[0]==key)
                    {
                        newTime = hasTime+time[2];
                        if(newTime<minTime[time[1]])
                        {
                            minTime[time[1]] = newTime;
                            back.put(time[1],newTime);
                        }
                    }
            }
            map = back;back = new HashMap<>();
        }
        int res = 0;
        for(int i=1;i<=N;i++)
            if(i!=K)
                if(minTime[i]==Integer.MAX_VALUE)   return -1;
                else res = Math.max(res,minTime[i]);
        return res;
    }
}
