import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JourneyToMoon2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=Integer.parseInt(sc.next());
		int l=Integer.parseInt(sc.next());
		boolean[] visited = new boolean[n];
		int[] ar = new int[n];
		for(int i=0;i<n;i++){
			ar[i]=-1;
		}
		int[] a = new int[l],b = new int[l];
		for(int i=0;i<l;i++){
			 a[i] = sc.nextInt();
			 b[i] = sc.nextInt();
		}
		for(int i=0;i<l;i++){
			if(!visited[a[i]]&&!visited[b[i]]){
				ar[a[i]]=a[i];
				ar[b[i]]=a[i];
				visited[a[i]]=true;
				visited[b[i]]=true;
			}else if(visited[a[i]]&&visited[b[i]]){
				if(ar[a[i]]!=ar[b[i]]){
					int temp = ar[b[i]];
					ar[b[i]]=ar[a[i]];
					for(int j=0;j<n;j++){
						if(ar[j]==temp){
							ar[j]=ar[a[i]];
						}
					}
				}
			}else if(visited[a[i]]&&!visited[b[i]]){
				ar[b[i]]=ar[a[i]];
				visited[b[i]]=true;
			}else{
				ar[a[i]]=ar[b[i]];
				visited[a[i]]=true;
			}
		}
		
		System.out.println(calculatePair(ar));
	}
	
	static long calculatePair(int[] a){
		long group =0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(a[0], 1);
		for(int i=1;i<a.length;i++){
			/*if(a[i]==-1){
				map.put(a[i], 1);
			}else*/ if(map.containsKey(a[i])){
				int c = map.get(a[i]);
				c++;
				map.put(a[i], c);
			}else{
				map.put(a[i], 1);
			}
		}
		int singles = 0;
		if(map.containsKey(-1)){
			singles = map.get(-1);
			map.remove(-1);
		}
		int[] ar= new int[map.size()];
		int k=0;
		int ind=0;
		for(int val : map.values()){
			ar[k]=val;
			ind+=val;
			k++;
		}
		for(int i=0;i<ar.length-1;i++){
			for(int j=i+1;j<ar.length;j++){
				group += (long)(ar[i]*ar[j]);
			}
		}
		group+=(long)(ind*singles);
		long c=0;
		for(int i=singles-1;i>0;i--){
			c+=(long)i;
		}
		group+=(long)c;
		return group;
	}

}
