import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Non_Div_Sub {
	static int k;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		k = sc.nextInt();
		List<Integer> li = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			li.add(sc.nextInt());
		}
		System.out.println(nonDiv(li));
	}
	static int nonDiv(List<Integer> li){
		Integer[] a = new Integer[li.size()];
		Iterator<Integer> iterator = li.iterator();
		for (int i = 0; i < a.length; i++) {
			a[i] = iterator.next().intValue();
		}
		 for(int i=0;i<a.length-1;i++){
	            for(int j=i+1;j<a.length;j++){
	                if((a[i]+a[j])%k==0){
	                	li.remove(li.indexOf(removeElement(a,a[i],a[j])));
	                	return nonDiv(li);
	                }
	            }
	        }
		return li.size();
	}
	static int removeElement(Integer[] a, Integer a1, Integer a2){
		int c1=0,c2=0;
		for(int i=0;i<a.length;i++){
			if((a[i]+a1)%k==0){
				c1++;
			}
			if((a[i]+a2)%k==0){
				c2++;
			}
		}
		if(c1>c2){
			return a1;
		}else{
			return a2;
		}
	}
}
