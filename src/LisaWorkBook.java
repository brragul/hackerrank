import java.util.Scanner;

public class LisaWorkBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] t = new int[n];
		for(int i=0;i<t.length;i++){
			t[i]=sc.nextInt();
		}
		int ans = 0;
		int page = 1;
		int chap = 1;
		while(chap<=n){
			int temp = 0;
			for(int i=1;i<=t[chap-1];i++){
				if(page==i){
					ans++;
				}
				if(i%k==0){
					page++;
					
				}
				temp = i;
			}
			if(!(temp==t[chap-1])){
				page++;
			}
			chap++;
			
		}
		System.out.println(ans);
	}

}
