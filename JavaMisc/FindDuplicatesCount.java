package codiality;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicatesCount {
	
	public static void main(String[] args) {
        List <String> al = new ArrayList<String>();    //init first,just for test
        al.add("aaa");
        al.add("bbb");
        al.add("ccc");
        al.add("aaa");
        al.add("ccc");
        al.add("aa");
        al.add("aaa"); 
        
        Map<String,Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<al.size();i++){            
            Integer count = map.get(al.get(i));       
            map.put(al.get(i), count==null?1:count+1); 
        }
        System.out.println(map);        
        System.out.println("Max value Key : "
        		+ ""+map.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).get());
     }
}
