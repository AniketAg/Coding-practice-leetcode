class Solution 
{
    public boolean canFinish(int numCourses, int[][] prerequisites) 
    {
        
        Set<List<Integer>> mainList = new HashSet();
		
		for(int[] k : prerequisites) 
        {
		     List<Integer> tem = new ArrayList();        
		     tem.add(k[0]);
		     tem.add(k[1]);
		     mainList.add(tem);
		}
				
		while(mainList.size() > 1) 
        {
		   List<Integer> toberemoved = null;
		   Set dList = mainList;
           Set<Integer> contain = new HashSet();
		   Iterator i = dList.iterator();
		   
           while(i.hasNext()) 
           {
		       List<Integer> l = (List<Integer>)i.next();
		       contain.add(l.get(1));
 		   }
 		   
           dList = mainList;
 		   i = dList.iterator();
 		   
           while(i.hasNext()) 
           {
 		       List<Integer> l = (List<Integer>)i.next();
 		       if(!contain.contains(l.get(0))) 
               {
 		           toberemoved = l;
                   break;
 		       }
 		   }
 		   
           if(toberemoved == null) 
 		       return false;
 		   mainList.remove(toberemoved);
		}
		
		return true;
        
    }
}
