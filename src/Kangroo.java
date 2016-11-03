import java.util.Scanner;

public class Kangroo {
	public static int x1 ;
	public static int v1 ;
	public static int x2 ;
	public static int v2 ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 x1 = sc.nextInt();
		v1 = sc.nextInt();
		x2 = sc.nextInt();
		v2 = sc.nextInt();
		if(x1<x2){
			if(v1>v2){
				if(compute()){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}else{
				System.out.println("NO");
			}
		}else if(x1==x2){
			if(v1==v2){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}else{
			if(v1<v2){
				if(compute()){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}else{
				System.out.println("NO");
			}
		}
		
	}
	public static boolean compute(){
		int s1 =x1+v1,s2=x2+v2;
		if(s1==s2){
			return true;
		}
		do{
			s1+=v1;s2+=v2;
			if(s1==s2){
				return true;
			}
			
		}while(Math.min(s1, s2)<Math.max(s1, s2));
		return false;
	}
	

}
