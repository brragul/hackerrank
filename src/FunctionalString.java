import java.util.ArrayList;
import java.util.List;

public class FunctionalString {

	public static void main(String[] args) {
		String s = "aba";
		List<String> l = new ArrayList<String>();
		for(int i=1;i<=s.length();i++){
			seperateString(s,i);
		}
	}
	static void seperateString(String s,int i){
		int l =0;
		List<String> li = new ArrayList<String>();
		while(l<s.length()){
			li.add(s.substring(l,l+1));
			l+=i;
		}
	}
	
	static void makeCombinations(List<String> li){
		
	}

}
