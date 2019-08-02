class Solution {
    public int findMinArrowShots(int[][] points) {
    
    if(points.length == 0)
        return 0;
    int ans = 1;
    
    Arrays.sort(points,(a,b) -> a[0] - b[0]);
    
    for(int i = 1; i < points.length; i++)
    {
        if(points[i-1][1] >= points[i][0])
            points[i][1] = Math.min(points[i-1][1],points[i][1]);//limiting the boundry
        else  ans++;
    }
    
    return ans;
    }
}
