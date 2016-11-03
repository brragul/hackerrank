import java.util.Scanner;

public class MaxSubarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MaxSubarray obj = new MaxSubarray();
		int t = sc.nextInt();
		for(int m=0;m<t;m++){
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int j=0;j<n;j++){
				a[j]=sc.nextInt();
			}
			obj.findMaxSub(a);
			
		}
	}
	void findMaxSub(int[] a){
		int noncon =0;
		int con = 0;
		for(int i: a){
			int temp = con;
			noncon+=(i>0)?i:0;
			con= (temp>(temp+i))?temp:(con+i);
		}
		System.out.println(con+" "+noncon);
	}

}
