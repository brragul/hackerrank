import java.util.*;

public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        int small = x1,large=x2;
        
        if(x2<x1){
        	small=x2;
        	large=x1;
        	int t=v1;
        	v1=v2;
        	v2=v1;
        }
        if(v1<v2){
        	System.out.println("NO");
        	return;
        }
        while(small<large){
        	small += v1;
        	large +=v2;
        	if(small==large){
        		System.out.println("YES");
        		return;
        	}
        }
        System.out.println("NO");
    }
    
}
