import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Anagram {
	public static ConcurrentHashMap<String,Integer> map1 = new ConcurrentHashMap<String,Integer>();
	public static ConcurrentHashMap<String,Integer> map2 = new ConcurrentHashMap<String,Integer>();
    public static int numberNeeded(String first, String second) {
      for(String a :first.split("")){
    	  putInMap(a,1);
      }
      for(String a :second.split("")){
    	  putInMap(a,2);
      }
    	
    	return mapCompare();
    }
    
    private static int mapCompare(){
    	int n = 0;
    	for(String key : map1.keySet()){
    		if(map2.containsKey(key)){
    			n += (Math.abs(map1.get(key)-map2.get(key)));
    			map1.remove(key);
    			map2.remove(key);
    		}else{
    			n += map1.get(key);
    			map1.remove(key);
    		}
    	}
    	for(Integer i : map2.values()){
    		n += i;
    	}
    	return n;
    }
    private static void putInMap(String s, int m){
    	if(m==1){
	    	if(map1.containsKey(s)){
	    		Integer i = map1.get(s);
	    		i++;
	    		map1.put(s, i);
	    	}else{
	    		map1.put(s, 1);
	    	}
    	}else{
    		if(map2.containsKey(s)){
	    		Integer i = map2.get(s);
	    		i++;
	    		map2.put(s, i);
	    	}else{
	    		map2.put(s, 1);
	    	}
    	}
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
