import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JumpCloud {

     public static void main(String[] args) {
    	int count = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        for(int i=0;i<c.length-1;){
        	if(c[i+1]==0)
        	{
        		if(i+2<c.length)
        		{
        			if(c[i+2]==0)
        			{
        				count++;
        				i=i+2;
        			}else
        			{
        				count++;
        				i++;
        			}
        		}
        		else{
        			count++;
            		i=i+1;
        		}
        	}
        	else
        	{
        		count++;
        		i=i+2;
        	}
        }
        System.out.println(count);
    }
}
