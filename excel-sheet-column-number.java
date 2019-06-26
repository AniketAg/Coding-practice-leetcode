class Solution {
    public int titleToNumber(String s) {
        double result = 0;
		int pow = 0;
		for(int i=s.length()-1; i>=0; i--)
			result += Math.pow(26, pow++) * ((s.charAt(i) - 'A')  + 1);
		
		return (int)result;
    }
}
