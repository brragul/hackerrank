import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GameHR7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] res = new int[t];
		for(int i=0;i<t;i++){
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int j = 0;j<n;j++){
				a[j]=sc.nextInt();
			}
			res[i] = game(a);
		}
		for(int temp: res){
			System.out.println(temp);
		}
	}
	static int game(int[] a){
		System.out.println("shit");
		ArrayList<Integer> G = new ArrayList<Integer>();
		int s = 0, e = a.length-1;
		int leftsum = a[s];s++;
		G.add(a[e]);
		int rightsum = a[e];e--;
		
		while(!(s==e)){
			while(leftsum<=rightsum)
				{
					leftsum+=a[s];s++;
				}
			while(rightsum>leftsum)
				{
					G.add(a[e]);
					rightsum+=a[e];e--;
				}
		}
		if(leftsum==rightsum){
			int[] arr = new int[G.size()];
			Iterator<Integer> iterator = G.iterator();
			for (int i = 0; i < arr.length; i++) {
				arr[i] = iterator.next().intValue();
			}
			return 1+game(arr);
		}
		return 0;
	}

}
