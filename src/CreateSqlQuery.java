import java.util.Scanner;

public class CreateSqlQuery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = new String[405];
		float[] f = new float[405];
		for(int i=0;i<405;i++){
			s[i] = sc.next();
			f[i] = sc.nextFloat();
		}
		for(int i=0;i<405;i++){
			System.out.println("INSERT INTO FARES VALUES('"+s[i]+"',"+f[i]+");");
		}
	}

}
