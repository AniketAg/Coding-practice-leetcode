import java.util.*;

public class SAPtest
{
    public static void main(String args[])
    {
       /*
        String str = "abababababbbab";
        String sub = "wew";
        if (str.isEmpty() || sub.isEmpty()) 
           System.out.println("aa");
       
        int count = 0;
        int idx = 0;
        while ((idx = str.indexOf(sub, idx)) != -1) {
            count++;
            idx += sub.length();
        }
        System.out.println(count);
        

        
        */
        /*
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{6,7,8,9,10};
        
        List<Integer> a = new ArrayList<Integer>() ;

        for(int i = 0; i < arr1.length; i++)
            a.add(arr1[i]);
            System.out.println("abc");
        int count = 0, j = 0;
        while(count!=2 && j < arr2.length)
        {
            if(a.contains(arr2[j++]))
                count++;
            if(count == 2)
                {System.out.println(arr2[j-1]);break;}
        }
        System.out.println("abc");
        */
        /*
        String date = "2-3-19";
        System.out.println("abc");
        List<String> Month = new ArrayList<String>();
        Month.add("Jan");Month.add(1,"Jan");Month.add(2,"Feb");Month.add(3,"Mar");Month.add(4,"Apr");Month.add(5,"May");Month.add(6,"Jun");Month.add(7,"Jul");Month.add(8,"Aug");Month.add(9,"Sep");Month.add(10,"Oct");Month.add(11,"Nov");Month.add(12,"Dec");
        System.out.println("abc");
        
        String data[] = date.split("-",3);
        System.out.println(data[0]);
        List<String> day = new ArrayList<String>();
        day.add("th");day.add(1,"st");day.add(2,"nd");day.add(3,"rd");//day.add(21,"st");day.add(22,"nd");day.add(23,"rd");day.add(31,"st");
        String output = Month.get(Integer.parseInt(data[0])) + " " + data[1] + day.get(Integer.parseInt((data[1])))  + "," + " " + "20" + data[2];        
        System.out.println(output);
        */
    }

}