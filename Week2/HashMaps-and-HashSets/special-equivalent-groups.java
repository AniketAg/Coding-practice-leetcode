class Solution {
    public int numSpecialEquivGroups(String[] A) {
 
        HashSet < String > set = new HashSet < > ();
        for (String c: A) 
        {
            int[] count = new int[52];
           
            for (int i = 0; i < c.length(); ++i)
                count[c.charAt(i) - 'a' + 26 * (i % 2)]++;
            
            set.add(Arrays.toString(count));
        }

        return set.size();
    }
}
