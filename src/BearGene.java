import java.io.*;
import java.util.*;

public class BearGene {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        int A=0,C=0,T=0,G=0;
        for(int i=0;i<n;i++){
            String t = String.valueOf(s.charAt(i));
            if(t.equals("A")){
                A++;
            }else if(t.equals("C")){
                C++;
            }else if(t.equals("T")){
                T++;
            }else{
                G++;
            }
        }
        int t=n/4;
        int out=0;
        if(A<t){
            out+=(t-A);
        }
        if(C<t){
            out+=(t-C);
        }
        if(T<t){
            out+=(t-T);
        }
        if(G<t){
            out+=(t-G);
        }
        System.out.println(out);
    }
}