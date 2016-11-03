import java.util.Scanner;

public class TileHR7 {

    public static void main(String[] args) {
        int count =1;
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String C = in.next();
        String[] s = C.split("");
        String c = s[0];
        for(int i=1;i<s.length;i++){
            if(!s[i].equals(c)){
            	c=s[i];
            	count++;
            }
        }
        System.out.println(count);
    }
}