import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayLeftRotation {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
//        if(k==0){
//            return a;
//        }
       int[] t = new int[n];
       int p= n-k;
       int c = 0;
       for(int i=0;i<k;i++){
    	   t[p]=a[i];
    	   p++;
    	   c++;
       }
       for(int i=0;c<n;i++){
    	   t[i]=a[c];
    	   c++;
       }
       return t;
//      for(int i=0;i<n-1;i++){
//        t[i]=a[i+1];
//      }
//        t[n-1]=a[0];
       // return arrayLeftRotation(t,n,k-1);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
            
        System.out.println();
      
    }
}
