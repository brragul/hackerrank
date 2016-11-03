import java.util.*;

public class RansomNote {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public RansomNote(String magazine, String note) {
    	magazineMap = new HashMap<String,Integer>();
    	noteMap= new HashMap<String,Integer>();
    	for(String s : magazine.split(" ")){
    		if(magazineMap.containsKey(s)){
    			int i = magazineMap.get(s);
    			magazineMap.put(s, ++i);
    		}else{
    			magazineMap.put(s, 1);
    		}
    	}
    	for(String s : note.split(" ")){
    		if(noteMap.containsKey(s)){
    			int i = noteMap.get(s);
    			noteMap.put(s, ++i);
    		}else{
    			noteMap.put(s, 1);
    		}
    	}
    }
    
    public boolean solve() {
        boolean yn = false;
        for(String s : noteMap.keySet()){
        	if(!magazineMap.containsKey(s)){
        		return false;
        	}else{
        		int m = magazineMap.get(s);
        		int n = noteMap.get(s);
        		if(m<n){
        			return false;
        		}
        	}
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        RansomNote s = new RansomNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
