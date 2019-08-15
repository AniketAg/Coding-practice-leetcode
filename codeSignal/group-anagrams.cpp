class Solution 
{

    public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) 
    {
        vector<vector<string> > result; 
        unordered_map<string, int> dict;
        for(int i=0; i<strs.size(); ++i)
        {
            const string x = strs[i];
            const string key = GetKey(x);
            if(dict.find(key) == dict.end())
            {
                result.push_back(vector<string>(1, x));
                dict[key] = result.size()-1; 
            }
            else
                result[dict[key]].push_back(x); 
        }
        return result;
    }

    private:
    string GetKey(const string& x)
    {
        string result(26, '0'); 
        for(int i=0; i<x.size(); ++i)
            ++result[x[i]-'a'];
        return result;
    }
};
