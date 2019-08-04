class Solution 
{
    public List<String> findWords(char[][] board, String[] words) 
    {
        List<String> res = new ArrayList<>();
        TrieNode root = buildTrie(words);
        for (int i = 0; i < board.length; i++) 
            for (int j = 0; j < board[0].length; j++) 
                dfs (board, i, j, root, res);
        return res;
    }

public void dfs(char[][] board, int i, int j, TrieNode p, List<String> res) 
{
    char c = board[i][j];
    if (c == '#' || p.next[c - 'a'] == null) return;
    p = p.next[c - 'a'];
    if (p.word != null) 
    {   // found one
        res.add(p.word);
        p.word = null;     // de-duplicate
    }

    board[i][j] = '#';
    if (i > 0) dfs(board, i - 1, j ,p, res); 
    if (j > 0) dfs(board, i, j - 1, p, res);
    if (i < board.length - 1) dfs(board, i + 1, j, p, res); 
    if (j < board[0].length - 1) dfs(board, i, j + 1, p, res); 
    board[i][j] = c;
}

public TrieNode buildTrie(String[] words) 
{
    TrieNode root = new TrieNode();
    for (String w : words) 
    {
        TrieNode p = root;
        for (char c : w.toCharArray()) 
        {
            int i = c - 'a';
            if (p.next[i] == null) p.next[i] = new TrieNode();
            p = p.next[i];
        }
       p.word = w;
    }
    return root;
}

class TrieNode 
{
    TrieNode[] next = new TrieNode[26];
    String word;
}
    
    /*public List<String> findWords(char[][] board, String[] words) 
    {
        List<String> myList = new ArrayList<String>();
        for(int k = 0; k < words.length; k++)
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[i].length; j++)
            {
                char[] cmp = words[k].toCharArray();
                
                if(cmp[0]==board[i][j])
                for(int l = 1; l < cmp.length; l++)
                {
                        System.out.println(cmp[l-1]);
                        if((i-1)<board.length && (i-1) > 0 && cmp[1]==board[i-1][j] )
                        {
                            if((i-2)<board.length && (i-2) > 0 && cmp[1]==board[i-2][j] )
                            {
                                
                            }
                            else if((i-2)<board.length && (i-2) > 0 && cmp[1]==board[i+2][j] )
                            {
                                
                            }
                            
                            System.out.print(cmp[l]);
                            if(l==cmp.length-1)
                                myList.add(words[k]);
                            //else continue;
                        }
                        else if( (i+1)<board.length && cmp[1]==board[i+1][j] )
                        {
                            System.out.print(cmp[l]);
                            if(l==cmp.length-1)
                                myList.add(words[k]);
                            //else continue;
                        }
                        else if ( (j-1)>0  && (j-1)<board[i].length && cmp[1]==board[i][j-1] )
                        {
                            System.out.print(cmp[l]);
                            if(l==cmp.length-1)
                                myList.add(words[k]);
                            //else continue;
                        }
                        else if( (j+1) < board[i].length && cmp[1]==board[i][j+1] )
                        {
                            System.out.print(cmp[l]);
                            if(l==cmp.length-1)
                                myList.add(words[k]);
                            //else continue;
                        }
                }
            }
        }
            
    return myList;    
    }*/
}
