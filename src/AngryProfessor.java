import java.io.*;
import java.util.*;

public class AngryProfessor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i<t;i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            AngryOrNot(arr,k,n);
        }
    }
    static void AngryOrNot(int[] a,int k,int n){
        for(int b:a){
            if(b>0){
                n--;
            }
        }
        if(n>=k){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}