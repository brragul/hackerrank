import java.util.Scanner;

public class Qheap1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[0];
		System.out.println(arr);
		int t = sc.nextInt();
		for(int k=0;k<t;k++){
			for(int a:arr){
				System.out.print(a+" ");
			}
			System.out.println();
			int o = sc.nextInt();
			if(o==3){
				//Print_min
				System.out.println(arr[0]);
			}else{
				int v = sc.nextInt();
				if(o==1){
					//add to heap
					arr = insert(arr, v);
				}else{
					//delete element to heap
					
				}
			}
		}
	}
	static int[] insert(int[] a,int v){
		int[] a1 = new int[a.length+1];
		for(int i=0;i<a.length;i++){
			a1[i]=a[i];
		}
		a1[a1.length-1]=v;
		return a1;
	}

}
